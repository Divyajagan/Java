import java.util.Collections;
import java.util.ArrayList;
import java.io.*;

public class swaptwoarraylist
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Raja");
		a.add("Danny");
		a.add("kumar");
		a.add("Sathya");
		a.add("Priya");
		a.add("Raju");
		a.add("Sunil");
		System.out.println("Before swapping" );
		System.out.println(a);
		Collections.swap(a,2,5);
		System.out.println("After swapping");
		for(String j: a)
		{
			System.out.println(j);
		}
	}
}
