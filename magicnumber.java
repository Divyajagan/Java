import java.util.*;
class magicnumber
{
	public static void main(String args[])
	{
		int a,b,temp1,temp,c=0,d=0;
		System.out.println("Enter the number");
		Scanner sin=new Scanner(System.in);
		int n=sin.nextInt();
		temp=n;  
   		 while(n>0)  
   		 {  
   			 a=n%10;  
    			 n=n/10;  
   			 c=c+a;  
    		}  
    		temp1=c;
		while(c>0)
		{
			b=c%10;
			c=c/10;
			d=d+b;
		}
		if(d==1)
		System.out.println("Given number is magic number");
		else
		System.out.println("Given number is not magic number");
		
}
}