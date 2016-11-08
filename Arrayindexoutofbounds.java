import java.util.*;
public class Arrayindexoutofbounds
{
public static void main(String args[])
{
int a[]={1,2,4,5};
try
{
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
catch(Exception e)
{
System.out.println(a[3]);
}
finally
{
System.out.println("Exception has handled");
}
}
}