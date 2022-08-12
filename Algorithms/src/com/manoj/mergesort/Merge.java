package com.manoj.mergesort;

import java.util.Arrays;

class Merge {  
	  
/* Function to merge the subarrays of a[] */  
void merge(int a[], int beg, int mid, int end)    
{    
    
	int n1= mid-beg+1;
	int n2 = end-mid;
	int L[] = new int[n1];
    int R[] = new int[n2];
    
    for(int i=0; i< n1 ; i++) {
    	L[i] = a[beg+i];
    	
    }
    for(int j=0; j< n2 ;j++) {
    	R[j] = a[mid+1+j];
    	
    }
    
    int i=0 , j=0;
    int k=beg;
    
    while(i < n1 && j < n2) {
    	if(L[i] <= R[j])
    	{
    		a[k] = L[i];
    		i++;
    	}else {
    		a[k] = R[j];
    		j++;
    	}
    	k++;
    }
    while(i<n1) {
    	a[k] = L[i];
		i++;
		k++;
    }
    while(j<n2) {
    	a[k] = R[j];
		j++;
		k++;
    }
  
}    
  
void mergeSort(int a[], int beg, int end)  
{  
   if(beg < end) {
	   
	   int mid = beg + (end-beg)/2;
	   mergeSort(a, beg, mid);
	   mergeSort(a, mid+1, end);
	   merge(a, beg, mid, end);
	   
	   
	   
   }
}  
  
/* Function to print the array */  
void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
  
public static void main(String args[])  
{  
    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
    int n = a.length;  
    Merge m1 = new Merge();  
    System.out.println("\nBefore sorting array elements are - ");  
    m1.printArray(a, n);  
    m1.mergeSort(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    m1.printArray(a, n);  
    System.out.println("");  
}  
  
  }  