import java.util.*;
public class bubblesort
{
	public static void main(String args[])
	{

		int n,i,j,s;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		n=input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter"  +n+  "integers");
		for(i=0;i<n;i++)
		a[i]=input.nextInt();
		for (i = 0; i<(n-1); i++)
	        {
      			for (j=0;j<n-i-1;j++) 
			{
       				 if (a[j] > a[j+1])
				 { 
          				s = a[j];
          			 	a[j]   = a[j+1];
          			 	a[j+1] = s;
        			}
      			}
    		}
 
    		System.out.println("Sorted list of numbers");
        	for (i = 0; i < n; i++) 
        	System.out.println(a[i]);
  
	}
}		