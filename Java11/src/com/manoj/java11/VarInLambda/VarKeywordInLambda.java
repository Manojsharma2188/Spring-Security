package com.manoj.java11.VarInLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarKeywordInLambda {

	public static void main(String[] args) {
		
		List<String> tutorialsList = Arrays.asList("Java", "HTML");
		//Use of var in lambda
		 String tutorials = tutorialsList.stream()
		         .map(( var tutorial) -> tutorial.toUpperCase())
		         .collect(Collectors.joining(", "));
		 System.out.println(tutorials);

	}

}
