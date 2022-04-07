package com.Que;

import java.util.Scanner;

public class mainQue {
	
	public static void main(String[] args) {
		int choice;
		Queue q= new Queue();
		Scanner scn= new Scanner(System.in);
		
		
		
		
		
		while(true)
		{
			System.out.println();
			System.out.println(" choose 1 to enque");
			System.out.println(" choose 2 to deQue");
			System.out.println(" choose 3 to traverse");
			System.out.println(" choose 4 to isEmpty");
			System.out.println(" choose 5 to isFull");
			System.out.println(" choose 6 to exit");
			
			choice = scn.nextInt();
			
			switch(choice) 
			{
			case 1: //System.out.println("");
				q.enQueue(scn.nextInt());
					break;
					
			case 2: //System.out.println("");
			q.deQueue();
				break;
				
				
			case 3:// System.out.println("");
			q.display();
				break;
				
			case 4: //System.out.println("");
			q.isEmpty();
				break;
				
			case 5:// System.out.println("");
			q.isFull();
				break;
				
				
			case 6: System.exit(0);
				break;
				
			default:
				System.out.println("invalid input");
			
			}
		}
		 
				
		

		
		
	}

}
