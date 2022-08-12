package com.manoj.mergesort;

import java.util.Arrays;

public class MergeSortExamole {
	
	private void mergesort(int[] a, int i, int n) {
		
		if(i < n) {
			
			int mid = n-i/2;
			
			mergesort(a, i, mid);
			mergesort(a,mid+1,n);
			merge(a,i,mid,n);
			
		}
		
	}
	
	
	private void merge(int[] a, int in, int mid, int n) {
		
		int n1= mid-in+1;
		int n2 = n-mid;
		
		    int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	        
	        for(int i=0; i < n1; i++) {
	        	LeftArray[i] = a[in+1];
	        }
	        for(int j=0; j < n1; j++) {
	        	RightArray[j] = a[mid+1+j];
	        }
	        
	        int i=0;
	        int j=0;
	        int k=in;
	        
	        while(i<n1 && j<n2) {
	        	if(LeftArray[i]>= RightArray[j]) {
	        		a[k] = LeftArray[i];
	        		i++;
	        		
	        	}
	        	else {
	        		a[k] = RightArray[j];
	        		j++;
	        	}
	        	k++;
	        }
	        while(i< n1)
	        {
	        	a[k] = LeftArray[i];
	        	i++;
	        	k++;
	        }
	        while(j< n2)
	        {a[k] = RightArray[j];
    		j++;
    		k++;
	        }
		
	}


	public static void main() {
		
	    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
        int n= a.length;
        
        MergeSortExamole m = new MergeSortExamole();
        m.mergesort(a, 0, n);
        
        Arrays.stream(a).forEach(l -> System.out.println(l));
	}

	
	

}
