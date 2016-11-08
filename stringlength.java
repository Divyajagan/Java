class calclength
{
public void strlength(String str)
{
int i,c;
for(i=0,c=0;i>=0;i++,c++)
{
str.charAt(i);
}
System.out.println("Length is"+c);
}
public static void main(String args[])
{
calclength sobj=new calclength();
sobj.strlength("This is test");
}
}