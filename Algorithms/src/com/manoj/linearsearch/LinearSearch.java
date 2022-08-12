package com.manoj.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = { 90, 4, 1, 8, 33, 19, 34, 3 };

		int k = 390;

		int search = lSearch(a, k);

		System.out.println("The index " + search);
	}

	private static int lSearch(int[] a, int k) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				index = i;
				return index;
			}
		}

		return -1;
	}

}
