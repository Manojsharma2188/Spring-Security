package com.manoj.java8.DefualtMethod;

 interface DefMetod{
	
	default void get()
	{
		System.out.println("Hello This is default method");
	}
	
	static void show()
	{
		System.out.println("Hello static method");
	}
	
}



public class DefaultMethod implements DefMetod {

	public static void main(String[] args) {
	
		DefMetod df = new DefaultMethod();
		df.get();
		
		DefMetod.show();

	}

}
