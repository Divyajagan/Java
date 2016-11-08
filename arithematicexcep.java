import java.util.*;
public class arithematicexcep
{
int num,result;
void divide()
{
try
{
result=num/0;
}
catch(Exception e)
{
System.out.println("This is my first exception program");
}
}
 void display()
{
System.out.println("print value");
}
public static void main(String[] args)
{
arithematicexcep s1=new arithematicexcep();
s1.divide();
s1.display();
}
}
