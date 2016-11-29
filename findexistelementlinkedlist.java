import java.util.LinkedList;
import java.util.Collections;
import java.util.*;

public class findexistelementlinkedlist
{
	public static void main(String args[])
	{
		LinkedList<String> a=new LinkedList<String>();
		a.add("Raja");
		a.add("Danny");
		a.add("kumar");
		a.add("Sathya");
		a.add("Priya");
		a.add("Raju");
		a.add("Sunil");
		boolean b=a.contains("Raju");
		if(b)
		{
			System.out.println("The first element is exist in Linked list ");
		}
		else
		{
			System.out.println("The first element is not exist in Linked list ");
		}
	}
}