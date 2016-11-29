import java.util.*;
class prime
{
	public static void main(String args[])
	{		
		int n, i, res;
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				 for (i = 1; i <= 1000; i++)   
				 {
				 	System.out.println("Prime number is " +i);
				 }
			}
		}
		
	}
}