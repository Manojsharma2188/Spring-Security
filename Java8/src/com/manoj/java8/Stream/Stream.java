package com.manoj.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 2, 5, 3, 5, 1, 5);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// use of for each
		System.out.println("Using Lambda");
		list.forEach(n -> {
			System.out.println(n);
		});
		System.out.println("Using Method Ref");
		list.forEach(System.out::println);

		// use of map
		System.out.println("Using Map ");
		List<Integer> squaresList = list.stream().map(i -> i * 2).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);

		// use of filter
		System.out.println("Use of filter ");
		long num = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty String Count  = " + num);

		// use of limits - Give 10 random number
		System.out.println("Use of Limits ");
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		// Use of sort
		System.out.println("Use of Sort ");
		list.stream().sorted().forEach(System.out::println);

		

	}

}
