package com.manoj.bubblesort;

public class Bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Declare int array 
		int intarr[] = { 2, 7, 1, -6, 5, 7, -4, 8, 15, 25 };
        
		for (int lastindex = intarr.length - 1; lastindex > 0; lastindex--) {
			for (int i = 0; i < lastindex; i++) {
				if (intarr[i] > intarr[i + 1]) {
					swap(intarr, i, i + 1);
				}
			}
		}
		for (int i = 0; i <= intarr.length; i++) {
			System.out.println(intarr[i]);
		}

	}

	public static void swap(int arr[], int i, int j) {
		if (i == j)
			return;

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
