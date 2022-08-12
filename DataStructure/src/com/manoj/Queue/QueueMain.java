package com.manoj.Queue;

public class QueueMain {
	
	int[] Queue = new int[5];
	int front;
	int rear;
	int size;
	
	public void enque(int data)
	{
		Queue[rear] = data;
		rear = rear+1;
		size = size+1;
	}
	
	public int deque()
	{
		int data = Queue[front];
		front = front +1;
		size = size -1;
		return data;
	}
	
	public void show()
	{
		System.out.println("Element added ");
		for(int i=0; i < size; i++)
		{
			System.out.println(Queue[front + i]);
		}
	}

}
