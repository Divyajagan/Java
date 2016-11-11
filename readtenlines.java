
import java.io.*; 
import java.io.FileWriter;
import java.util.Scanner; 

public class readtenlines
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the 1st line");
String a=input.nextLine();
System.out.println("Enter the 2nd line");
String b=input.nextLine();
System.out.println("Enter the 3rd line");
String c=input.nextLine();
System.out.println("Enter the 4th line");
String d=input.nextLine();
System.out.println("Enter the 5th line");
String e=input.nextLine();
System.out.println("Enter the 6th line");
String f=input.nextLine();
System.out.println("Enter the 7th line");
String g=input.nextLine();
System.out.println("Enter the 8th line");
String h=input.nextLine();
System.out.println("Enter the 9th line");
String i=input.nextLine();
System.out.println("Enter the 10th line");
String j=input.nextLine();

 try
	{  
   		FileWriter fw=new FileWriter("C:\\DivyaJava\\abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);   
		bw.write(a);
		bw.newLine();
		bw.write(b);
		bw.newLine();
		bw.write(c);
		bw.newLine();
		bw.write(d);
		bw.newLine();
		bw.write(e);
		bw.newLine();
		bw.write(f);
		bw.newLine();
		bw.write(g);
		bw.newLine();
		bw.write(h);
		bw.newLine();
		bw.write(i);
		bw.newLine();
		bw.write(j);
		bw.newLine();
		bw.close();  
	}
	catch(IOException ex)
	{
		System.out.println(ex.toString());
	}  
	finally
	{
		System.out.println("3rd position message is"+c);
		System.out.println("4th position message is"+d);
	}
  	System.out.println("success");  
 }  
}  