package com.manoj.quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
	
		int a[] = {90,4,-1,8,33,-19,34,3};
		int n = a.length;
		
		quicksort(a, 0, n);
		
		Arrays.stream(a).forEach(k -> {
			System.out.println(k);
			
		});
		
	}

	private static void quicksort(int[] a, int start, int end) {
		
		if(end - start < 2)
			return;
		
		int pivotindex = partition(a, start, end);
		
		quicksort(a, start, pivotindex-1);
		quicksort(a, pivotindex+1, end);
			
		
	}

	private static int partition(int[] a, int start, int end) {
	
		int pivot = a[end-1];
		int i = start -1;
		
		for(int j = start ; j < end-1; j++)
		{
			if (a[j] < pivot)  
	        {  
	            i++; // increment index of smaller element  
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end-1];  
	    a[end-1] = t;  
	    return (i + 1); 
	    
	    
		}
		
		

}
