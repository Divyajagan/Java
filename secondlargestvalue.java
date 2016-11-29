import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class secondlargestvalue
{
	public static void main(String args[])
	{
		int highest = 0;
 		int second_highest = 0;
		List a = new ArrayList();
		a.add("55");
		a.add("17");
		a.add("22");
		a.add("36");
		a.add("9");
		a.add("42");
		Collections.sort(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println("The second largest value is " +a.get(i-2));
		}
	}
}