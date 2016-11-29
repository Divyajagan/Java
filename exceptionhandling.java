import java.util.*;
public class exceptionhandling
{
	public static void main(String args[])
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
			cusid=Byte.ValueOf(br.readLine());
			System.out.println("Enter customer Name");
			cusname=br.readLine();
			System.out.println("Enter customer Age");
			cusage=Integer.ParseInt(br.readLine());
			System.out.println("Enter customer Salary");
			cussal=Float.ParseFloat(br.readLine());
			System.out.println("Enter customer Grade");
			cusgrade=(char)(br.readLine());
			System.out.println("Customer Id is"+cusid);
			System.out.println("Customer Name is"+cusname);
			System.out.println("Customer Age is"+cusage);
			System.out.println("Customer Salary is"+cussal);
			System.out.println("Customer Grade is"+cusgrade);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
			