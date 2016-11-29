import java.util.*;
public class splitlength
{  
    	public static void main(String args[])
	{  
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the character");
           String s1=input.nextLine();
    	   String[] words=s1.split(" "); 
    	    for(String w:words)
	    {  
    		System.out.println(w); 
		System.out.println("unique word count is " +w.length()); 
    	    }  
           	
	}
}  