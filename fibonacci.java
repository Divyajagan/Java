import java.util.*;
public class fibonacci
{
	public static void main(String args[])
	{
		int prev=1,next=1,sum,n;
		for(n=1;n<=10;n++)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}
		