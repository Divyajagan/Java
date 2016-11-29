import java.util.Scanner;
import java.util.Stack;
public class stack
{
	
	Scanner scan;
	Stack<String> stack;
	int n;
 	void push() 
	{
		
	 	scan = new Scanner(System.in);
		stack = new Stack<String>();
		System.out.println("Stack Push, Pop & Peek");
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		System.out.println("Enter the data - PUSH");
		for(int i=0; i<n; i++) 
		{
			
			stack.push(scan.next());
		}
	}
	
	void peek() 
	{
		
		System.out.println("\nTop Value of the Stack - PEEK");
		if(stack.isEmpty())
		System.out.println("The Stack is Empty..");
 		else
		System.out.println(stack.peek());
	}
	
	void pop() {
		
		System.out.println("\nThe Stack - POP");
		
		while(!stack.empty()) {
			
			System.out.println(stack.pop());
		}
		
		peek();
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		stack obj = new stack();
		
		obj.push();
		obj.peek();
		obj.pop();
	}
}

