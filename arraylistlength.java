import java.util.*;
public class arraylistlength
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ravi");
		a.add("Sasi");
		a.add("Divya");
		a.add("Bala");
		a.add("sunil");
		for(String obj:a)
		{
			System.out.println(obj);
		}
		int b=a.size();
		System.out.println("length is" +b);
	}
}