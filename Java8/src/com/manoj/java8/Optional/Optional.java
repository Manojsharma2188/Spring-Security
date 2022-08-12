package com.manoj.java8.Optional;

public class Optional {

	public static void main(String[] args) {
	
		Integer n1= 10;
		Integer n2= null;
		
		java.util.Optional<Integer> num1 = java.util.Optional.ofNullable(n1);
		java.util.Optional<Integer> num2 = java.util.Optional.of(n2);
		
		System.out.println("Sum of two number with optional = "+ sum(num1, num2));

	}

	private static int sum(java.util.Optional<Integer> num1, java.util.Optional<Integer> num2) {
		
		System.out.println("A Exist = "+ num1.isPresent());
		System.out.println("A Exist = "+ num2.isPresent());
		
		Integer a = num1.orElse(0);
		Integer b = num2.get();

		return a+b;
		
	}

}
