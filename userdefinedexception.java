import java.util.*;
class userdefinedexception
{  
  
   	static void A(int age)throws B
	{  
     		if(age<18)  
      		throw new B("not valid");  
	        else  
     	       System.out.println("welcome to vote");  
   	}  
     
   	public static void main(String args[])
	{  
      	try
	{  
      		A(13);  
      	}
         catch(Exception m)
	{
		System.out.println("Exception occured: "+m);
	}  
  
      System.out.println("rest of the code...");  
  }  
}  