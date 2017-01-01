import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Date;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*; 
import java.text.SimpleDateFormat;
public class Phone {


public static class Mapclass extends Mapper<Object, Text, Text, IntWritable>
{
	Text PhoneNumber=new Text();
	IntWritable durationMinutes = new IntWritable();
	
    public void map(IntWritable key, Text value, Context context ) 
    {
      try
      {
      String[] parts=value.toString().split(",");
      if(parts[4].equals("1"))
      {
    	  
    	  PhoneNumber.set(parts[0]);
    	  String callEndTime=parts[3];
    	  String callStartTime=parts[2];
    	  long duration=toMillis(callEndTime)-toMillis(callStartTime);
    	  durationMinutes.set((int)(duration/(1000*60)));
    	  context.write(PhoneNumber,durationMinutes);
      }
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
    }
    private long toMillis(String date) 
    {
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateFrm = null;
        try 
        {
            dateFrm = format.parse(date);

        } 
        
        catch (Exception e) 
        {

            e.printStackTrace();
       }
        return dateFrm.getTime();
    }
}
  public static class IntSumReducer  extends Reducer<Text,IntWritable,Text,IntWritable> 
  {
    private IntWritable result = new IntWritable();

    public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException 
    {
      long sum = 0;
      for (IntWritable val : values) 
      {
        sum += val.get();
      }
      result.set((int)sum);
      if(sum>=60)
      {
    	  context.write(key, result); 
      }
    }
      
    
 
}
  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    conf.set("mapred.textoutputformat.separator","'");
    Job job = Job.getInstance(conf, "Phone calls");
    job.setJarByClass(Phone.class);
    job.setMapperClass(Mapclass.class);
    //job.setCombinerClass(IntSumReducer.class);
    job.setReducerClass(IntSumReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}
