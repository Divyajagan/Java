import java.io.*;
import java.util.*;
public class exception2
{
	public static void main(String[] args)
	{
		byte cusid;
		String cusname;
		int cusage;
		float cussal;
		char cusgrade;
		try
		{
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("Enter customer Id");
			cusid=Byte.valueOf(br.readLine());
			System.out.println("Enter customer Name");
			cusname=br.readLine();
			System.out.println("Enter customer Age");
			cusage=Integer.parseInt(br.readLine());
			System.out.println("Enter customer Salary");
			cussal=Float.parseFloat(br.readLine());
			System.out.println("Enter customer Grade");
			cusgrade=(char)(br.read());
			System.out.println("Customer Id is"+cusid);
			System.out.println("Customer Name is"+cusname);
			System.out.println("Customer Age is"+cusage);
			System.out.println("Customer Salary is"+cussal);
			System.out.println("Customer Grade is"+cusgrade);
			FileOutputStream fobj=new FileOutputStream("d:\\demo.txt");
			fobj.write(cusid);
			fobj.write(cusname);
			fobj.write(cusage);
			fobj.write(cussal);
			fobj.write(cusgrade);		
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
			