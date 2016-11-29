import java.util.*;
public class arraylistadd
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ravi");
		a.add("Sasi");
		a.add("Divya");
		ArrayList<String> b=new ArrayList<String>();
		b.add("Bala");
		b.add("sunil");
		a.removeAll(b);
		for(String obj:a)
		{
			System.out.println(obj);
		}
	}
}