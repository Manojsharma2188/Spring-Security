package com.manoj.stack;

import java.util.LinkedList;

public class StackLinkedList {

	LinkedList<Integer> st = new LinkedList<Integer>();

	public void push(int data) {
		st.push(data);
	}

	public void pop() {
		st.pop();
	}

	public int peek() {
		int a = st.peek();
		return a;
	}
}
