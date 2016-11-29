import java.util.Scanner;
public class secondlargnum
{
	public static void main(String[] args) 
	{
    		int[] a=new int[6];
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the numbers");
        	for(int j=0;j<6;j++)
            	a[j]=sc.nextInt();
    		int num1 = 0; 
    		int num2 = 0; 
		 
		for(int n:a)
		{
 
			if(num1 < n)
			{
 
			      num2 = num1;
      			      num1 =n;
 
 			} 
			else if(num2 < n)
			{
 
 		               num2 = n;
 
			}
 
		}
        	
        	System.out.println("Second highest Number is: "+num2);

 
	 }
}
 
