import java.util.*;
class reverse
{
public static void main(String args[])
{
String s1;
Scanner in=new Scanner(System.in);
System.out.println("Enter a String");
s1=in.nextLine();
char[] ch=s1.toCharArray();
for(int i=s1.length()-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}
}
