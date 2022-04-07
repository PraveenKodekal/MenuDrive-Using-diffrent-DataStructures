package Stack;

import java.util.Scanner;

public class menu {
	
	static int top = -1;
	static int size=5;
	static int[] stack= new int[size];
	
	
	
	public static boolean isFull()// Checks whether the the stack is full or not.
	
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public static boolean isEmpty()// Checks whether the stack is empty or not
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public static void push(int ele)// Adding elements to the stack
	{
		if(isFull())
			System.out.println("Stack is Full");
		else
		{
			top++;
			 stack[top]=ele;
			System.out.println(" element "+ ele +" is inserted");
		}
	}
	
	public static void pop()// Removing the objects from the task
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			System.out.println(stack[top] + "is deleted");
			top--;
		}
	}
	
	public static void peek() // returning the topmost element of the stock
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println(stack[top]);
	}
	
	public static void traverse()	// display/traverse/show the elements present in the stack
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			for(int p=0; p<=top;p++)
				System.out.print(stack[p] + " ");
	}
	
	
	
	
	public static void main(String[] args) {
		 
		int choice;
		
		
		menu m1= new menu();
		Scanner scan= new Scanner (System.in);
		
		
		
		while(true)
		{
		System.out.println(" choose 1 to add the elemnts to stack");
		System.out.println(" choose 2 to delete an element");
		System.out.println(" choose 3 to return the top most elemnt of stack");
		System.out.println(" choose 4 to Elements present in a stock");
		System.out.println(" choose 5 to exit from the program");
		 choice= scan.nextInt();
		 
		 switch (choice)
		 {
		 case 1: System.out.println("Enter the element to be added to the stock");
		 						m1.push(scan.nextInt());						
		 						break;
		 case 2: System.out.println("Delete the element from stack");
		 				m1.pop();
		 				break;
			
		 case 3:
				 System.out.println("Return the topmost element of the stack" );
				 		m1.peek();
				 		break;
			
			
		 case 4: 
			 	System.out.println("Displaying the elements present in the stack ");
			 			m1.traverse();
			 			break;
			
		 case 5: 
			System.exit(0);
			
			
			default:
			System.out.println("Invalid choice... Please choose from the above options");
			
		 }
		
		
		}
		
	}
		

}
