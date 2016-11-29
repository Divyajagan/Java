import java.util.LinkedList;
import java.util.Collections;
import java.util.*;

public class findlastelementlinkedlist
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
		System.out.println("The first element in Linked list is : "+a.peekLast());
		System.out.println("The first element in Linked list is : "+a.getLast());
		}
}