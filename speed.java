

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class speed
{

  public static class Mapclass extends Mapper<Text, IntWritable, Text, IntWritable>
  {
	  public void map(Text key, IntWritable value, Context context)
	  {
		  try{
			  String[] str = value.toString().split(",");
			  int speed = Integer.parseInt(str[1]);
			  context.write(new Text(str[0]),new IntWritable(speed));
			}
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
  }
	  

  public static class Reduceclass extends Reducer<Text,IntWritable,Text,IntWritable> 
  {
    private IntWritable result = new IntWritable();

    public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException 
    {
      int sum=0;
      int count=0;
      for (IntWritable val : values) 
      {
    	  count++;
    	  sum += val.get();
      }
      int avg=sum/count;
      result.set(avg);
      context.write(key, result);
      
  }
  }

  public static void main(String[] args) throws Exception 
  {
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "Speed");
    job.setJarByClass(speed.class);
    job.setMapperClass(Mapclass.class);
    //job.setCombinerClass(Reduceclass.class);
    job.setReducerClass(Reduceclass.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(LongWritable.class);
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  
}
}