package com.manoj.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String arg[])
	{
		// Shell sort can be used with help of reduce gap by half and then appy insertion sort
		int a[] = {90,4,-1,8,33,-19,34,3};
		int n = a.length;
		
		for(int i=1; i < n; ++i)
		{
			int k = a[i];
			int j = i-1;
			while(j>=0 && a[j]> k)
			{
				a[j+1]=a[j];
				j=j-1;
			}
		   a[j+1] = k;
		}
		
		Arrays.stream(a).forEach(n1 -> {
			
			System.out.println(n1);
		});;
		
	}

}
