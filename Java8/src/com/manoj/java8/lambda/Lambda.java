package com.manoj.java8.lambda;

public class Lambda {

	public static void main(String[] args) {

		Lambda lambda = new Lambda();

		MathOperation addition = (int a, int b) -> a + b;

		MathOperation substraction = (a, b) -> a - b;

		MathOperation mul = (int a, int b) -> {
			return a * b;
		};

		MathOperation divide = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + lambda.perform(10, 5, addition));
		System.out.println("10 + 5 = " + lambda.perform(10, 5, substraction));
		System.out.println("10 + 5 = " + lambda.perform(10, 5, mul));
		System.out.println("10 + 5 = " + lambda.perform(10, 5, divide));

		Greet greet = (message) -> System.out.println("Hello " + message);

		greet.sayMessage("Manoj");
	}

	private int perform(int i, int j, MathOperation operation) {

		return operation.operation(i, j);
	}

}
