import java.util.*;
public class nullpointerexception
{
	public static void main(String args[])
	{
		try
		{
	
		String num=null;
		System.out.println(num.length());
		}
		catch(Exception e)
		{
			System.out.println("Null Pointer Exception ");
		}
			


	}

}