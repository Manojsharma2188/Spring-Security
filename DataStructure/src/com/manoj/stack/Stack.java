package com.manoj.stack;

public class Stack {

	public static void main(String[] args) {
		
		StackOps st = new StackOps();
		st.push(10);
		st.push(1);st.push(9);
		st.push(2);st.push(6);
	
		st.pop();
		System.out.println("Peek =" + st.peek());
		st.show();

	}

}
