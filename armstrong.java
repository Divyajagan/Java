import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int a,temp,c=0;
		System.out.println("Enter the number");
		Scanner sin=new Scanner(System.in);
		int n=sin.nextInt();
		temp=n;  
   		 while(n>0)  
   		 {  
   			 a=n%10;  
    			 n=n/10;  
   			 c=c+(a*a*a);  
    		}  
    		if(temp==c)  
    		System.out.println("armstrong number");   
    		else  
        	System.out.println("is not an armstrong number");
}
}