import java.util.Scanner;

public class swaptwonumbers
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter the number a and b");
		Scanner sin=new Scanner(System.in);
		a=sin.nextInt();
		b=sin.nextInt();
		System.out.println("Before swapping"+a);
		System.out.println("Before swapping"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping"+a);
		System.out.println("After swapping"+b);
	}
}