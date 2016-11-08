import java.util.*;
public class concatenate
{
public static void main(String args[])
{
String str1[]="First string";
String str2[]="second string";
int i=0,j=0;
System.out.println("Enter the first string");
System.out.println("Enter the second string");
Scanner sin=new Scanner(System.in);
str1[]=sin.nextLine();
str2[] =sin.nextLine();
while(str1[i]!=null)
  i++;
  while(str2[j]!=null)
  {
    str1[i]=str2[j];
    j++;
    i++;
  }
System.out.println(str1);
}
}