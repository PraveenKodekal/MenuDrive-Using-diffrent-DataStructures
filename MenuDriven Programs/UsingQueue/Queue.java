package com.Que;

public class Queue {
	
	
	int rear=0;
	int front=0;
	int size=4;
	int Que[]= new int[size];
	
	public boolean isFull()
	{
		if (rear==size)
		{
			System.out.println(" Queue is full");
			return true;
		}
		else
			System.out.println(" Que is not full");
			return false;
	}
	
	public boolean isEmpty()
	{
		if (rear==front)
		{
			System.out.println(" Que is empty");
			return true;
		}
		else
			System.out.println(" Que is not empty");
			return false;
	}
	public void enQueue(int ele)
	{
		if (isFull())
		{
			System.out.print("Queue is full");
		}
		else {
			
			Que[rear]=ele;
			rear++;
		}
	}
	
	public void deQueue()
	{
		if (isEmpty())
		{
			System.out.print("Queue is empty");
		}
		else {
			
			front++;
			//System.out.println(Que[front]);
			
		for(int i=0;i<rear-1;i++)
			{
				Que[i]=Que[i+1];
				//rear--;
			}
		}
	}
	
	public void display()
	{
		if (isEmpty())
		{
			System.out.print("Queue is empty");
		}
		else {
			
			for(int i=0;i<rear;i++)
			{
				
				System.out.print(Que[i]+" ");
			}
		}
	}

}
