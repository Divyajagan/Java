import java.util.*;
public class employeesuperkey
{
	float salary=40000;
}
public class staff extends employeesuperkey
{
	int bonus=1000;
	void display()
	{
		System.out.println(super.salary);
	}
	public static void main(String args[])
	{
		staff b=new staff();
		b.display();
	}
}