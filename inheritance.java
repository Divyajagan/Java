class calc
{
int z;
void add(int a,int b)
{
z=a+b;
System.out.println("result"+z);
}
void sub(int a,int b)
{
z=a-b;
System.out.println("result"+z);
}
}
public class inheritance extends calc
{
public void mul(int a,int b)
{
z=a*b;
System.out.println("result"+z);
}
public static void main(String args[])
{
int a=10,b=20;
inheritance s1=new inheritance();
s1.add(a,b);
s1.sub(a,b);
s1.mul(a,b);
}
}