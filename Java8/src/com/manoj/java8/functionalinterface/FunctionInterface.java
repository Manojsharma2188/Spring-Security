package com.manoj.java8.functionalinterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionInterface {

   public static void main(String args[]) {
	   

	   List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
	   
	   System.out.println("print all number");
	   eval(list, n->true);
	   
	   System.out.println("Print even number");
	   eval(list, n-> n%2 ==0);
	   
	   System.out.println("multiple of 5");
	   eval(list, n->n%5==0);
	   
	   
   }

private static void eval(List<Integer> list, Predicate<Integer> pridicate) {

	{
		for(Integer n : list)
		{
			if(pridicate.test(n))
			{
				System.out.println(n + " ");
			}
		}
	}
	
}
	
 
}