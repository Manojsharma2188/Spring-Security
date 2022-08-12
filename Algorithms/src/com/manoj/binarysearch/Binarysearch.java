package com.manoj.binarysearch;

public class Binarysearch {

	public static void main(String[] args) {
		int a[] = { 10, 50,70,170,189,270 };

		int k = 70;
		int start = 0;
		int end = a.length;
		int search = bSearch(a, k, start, end-1);
		if (search == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + search);
    }
	

	private static int bSearch(int[] a, int k, int start, int end) {
		 if (end  >= start) {
	            int mid = start + (end - start) / 2;
	 
	            // If the element is present at the
	            // middle itself
	            if (a[mid] == k)
	                return mid;
	 
	            // If element is smaller than mid, then
	            // it can only be present in left subarray
	            if (a[mid] > k)
	                return bSearch(a, start, mid - 1, k);
	 
	            // Else the element can only be present
	            // in right subarray
	            return bSearch(a, mid + 1, end, k);
	        }
	 
	        // We reach here when element is not present
	        // in array
	        return -1;
	}

}
