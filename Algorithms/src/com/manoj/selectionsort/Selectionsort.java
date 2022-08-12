package com.manoj.selectionsort;

public class Selectionsort {

	public static void main(String[] args) {
		int intarr[] = { 2, 7, 1, -6, 5, 7, -4, 8, 15, 25 };
		for (int l = intarr.length - 1; l > 0; l--) {
			int lar = 0;
			for (int i = 1; i <= l; i++) {
				if (intarr[i] > lar) {
					lar = i;
				}
			}

			swap(intarr, lar, l);

		}

		for (int i = 0; i <= intarr.length; i++) {
			System.out.println(intarr[i]);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		if (i == j)
			return;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
