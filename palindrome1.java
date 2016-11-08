import java.util.Scanner;
class Palindrome 
{
public static void main(String[] args) 
{
int a,num,b,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any num: ");
num=s.nextInt();
b=num;
while(num>0)
{
a=num%10;
num=num/10;
temp=temp*10+a;
}
if(temp==b)
{
System.out.println("It is a Palindrome");
}
else
{
System.out.println("It is not a Palindrome");
}
}


}

