import java.util.*;
class examplepublic1
{
private void add(int a,int b)
{
num1=a;
num2=b;
result=a+b;
}
}
class B
{
public void displayAdd()
{
System.out.println("The Addition of two number is"+result);
}
}
class c
{
public static void main(String args[])
{
examplepublic1 sum=new examplepublic1();
sum.add(10,20);
sum.displayAdd();
}
}
