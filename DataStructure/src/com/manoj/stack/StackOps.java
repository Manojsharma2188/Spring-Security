package com.manoj.stack;

public class StackOps {

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (stack.length == top) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public int pop() {

		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;

	}
	
	public int peek()
	{
		return stack[top];
	}

	public void show() {
		for (int num : stack) {
			System.out.println(num);
		}
	}

}
