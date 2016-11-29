import java.util.*;
public class factorial
{
	public static void main(String args[])
	{
		int n,i,c=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		n=input.nextInt();
		for(i=n;i>=1;i--)
		{
			c=c*i;
		}
		System.out.println("Factorial of entered number is" +c);
	}
}
