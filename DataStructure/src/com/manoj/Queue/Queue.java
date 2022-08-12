package com.manoj.Queue;

public class Queue {

	public static void main(String[] args) {
		QueueMain qm = new QueueMain();
		
		qm.enque(20);
		qm.enque(25);
		qm.enque(22);
		
		qm.deque();
		
		qm.show();
	}

}
