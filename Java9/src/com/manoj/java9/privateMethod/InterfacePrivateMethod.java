package com.manoj.java9.privateMethod;


interface Person{
	
	default void get()
	{
		data();
	}
	
	private void data() {
		
		System.out.println("Private method Called !!");
	}
}
public class InterfacePrivateMethod implements Person{

	public static void main(String[] args) {
	
		InterfacePrivateMethod prsn = new InterfacePrivateMethod();
		prsn.get();
	}

}
