import java.io.FileWriter;
import java.io.*;  
class filewriter
{  
	 public static void main(String args[])
	{  
 	 try
	{  
   		FileWriter fw=new FileWriter("C:\\DivyaJava\\abc.txt");  
   		fw.write("my name is sachin");
  	 	fw.close();  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}  
  	System.out.println("success");  
 }  
}  