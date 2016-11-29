import java.util.*;
public class duplicatenumber
{
	public static void main(String args[])
	{
		
		int[] numbers=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i=0;i<5;i++)
		numbers[i]=input.nextInt();
		Arrays.sort(numbers);
		for(int j = 1; j < numbers.length; j++)
		 {
			if(numbers[j] == numbers[j - 1])
			 {
				System.out.println("Duplicate: " + numbers[j]);
			 }
		 }
	}
}