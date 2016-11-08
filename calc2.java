class examplepublic
{
int num1,result;
double num2;
 
void add(int a,double b)
{
num1=a;
num2=b;
result=a+b;
}

void displayAdd()
{
System.out.println("The Addition of two number is"+result);
}
public static void main(String args[])
{
calc2 sum=new calc2();
sum.add(10,20.5);
sum.displayAdd();
}
}