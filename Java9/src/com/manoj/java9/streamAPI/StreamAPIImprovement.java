package com.manoj.java9.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovement {
	public static void main(String[] args) {
		// Added new takewhile method in API
		List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);

		// Added dropwhile
		List<Integer> list1 = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list1);

		// added a nullable
		Stream<Integer> val = Stream.ofNullable(null);
		val.forEach(System.out::println);

		// Added Itreate Method
		Stream.iterate(1, i -> i < 10, i -> i * 3).forEach(System.out::println);

	}
}