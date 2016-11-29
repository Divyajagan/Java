import java.util.*;
public class linklistadd
{
	public static void main(String args[])
	{
		LinkedList<String> a=new LinkedList<String>();
		a.add("Divya");
		a.add("Subagha");
		a.add("Jagan");
		a.add("Kumar");
		LinkedList<String> b=new LinkedList<String>();
		b.add("Mageswari");
		b.add("Pugazhendhi");
		b.add("Karthi");
		a.addAll(b);
		for(String obj:a)
		{
			System.out.println(obj);
		}
	}
}