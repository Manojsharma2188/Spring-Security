package com.manoj.java8.methodRef;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<>();
		list.add("Manoj");
		list.add("Mohit");
		list.add("Hello");
		
		list.forEach(System.out::println);
		

	}

}
