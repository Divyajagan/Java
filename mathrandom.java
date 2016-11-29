import java.util.*;
public class mathrandom
{
public static void main(String args[])
{
System.out.println("Random number between 1 to 100 are");
for(int i=0;i<10;i++)
System.out.println("Random number is["+(i+1)+"]:" +(int)(Math.random()*100));
}
}
