package com.manoj.recurssion;

public class Recurssion {

	public static void main(String[] args) {

		int n = 3;
		int a = getFact(3);

		System.out.println(a);

	}

	// Impl by recursion
	
	// 1! = 1
	// 2! = 2* 1!=2
	// 3! = 3 * 2! = 6
	// 4! = 4 * 3!= 24
	
	// n! = n * (n-1)!
	
	private static int getFact(int n) {

		if (n == 0)
			return 1;
		return n * getFact(n - 1);

	}

	// Simple impl of code

	/*
	 * private static int getFact(int num) {
	 * 
	 * if (num == 0) return 1; int f = 1; for (int i = 1; i <= num; i++) {
	 * 
	 * f = f * i;
	 * 
	 * } return f;
	 * 
	 * }
	 */
}
