import java.util.*;
public class linklistremove
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
		a.removeAll(b);
		for(String obj:a)
		{
			System.out.println(obj);
		}
	}
}