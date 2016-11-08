import java.util.Scanner;
class reversenumber 
{
	public static void main(String[] args) 
	{
		int a,num,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any num: ");
		num=s.nextInt();
		b=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
		}
		for(int i=num.length()-1;i>=0;i--)
		{
			System.out.print(i);

		}


	}
}
