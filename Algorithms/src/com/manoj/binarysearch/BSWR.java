package com.manoj.binarysearch;

public class BSWR {
	
	public static void main(String[] args) {
		 int arr[] = { 2, 3, 4, 10, 40 };
		 int x = 10;
		 
		 int a = bs(arr, x);
		 
		 System.out.println(a);
		 
	

	}

	private static int bs(int[] arr, int x) {
		
		int s =0;
		int e=arr.length-1;
		
		while( s < e) {
			
			int mid = s + (e-s)/2;
			
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid] > x) {
				e = mid -1;
			}
			
			if(arr[mid] < x) {
				s = mid +1;
			}
			
			
		}
		
		return -1;
	}


}
