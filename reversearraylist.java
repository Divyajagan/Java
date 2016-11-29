import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class reversearraylist
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ravi");
		a.add("Rama");
		a.add("Sunil");
		a.add("Senthil");
		a.add("kumar");
		System.out.println("Before reversing the ArrayList" +a);
		Collections.reverse(a);
		System.out.println("After reversing the arraylist");
		for(String l: a)
		{
			System.out.println(l);
		}
		

	}
}
		