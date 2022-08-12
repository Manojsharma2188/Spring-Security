package com.manoj.java11.StringEnhancement;

import java.util.ArrayList;
import java.util.List;

public class StringEnhancement {

	public static void main(String[] args) {
		
		String sample = " abc ";
		System.out.println(sample.repeat(2)); // print 2 time abc abc
		
		System.out.println(sample.isBlank());  // false
		System.out.println("".isBlank()); // true
		System.out.println("   ".isBlank()); // true
		
		//String.strip() − Removes the leading and trailing whitespaces.
		System.out.println(sample.strip());
		
		//String.stripLeading() − Removes the leading whitespaces.
		System.out.println(sample.stripLeading());
		
		//String.stripTrailing() − Removes the trailing whitespaces.
		System.out.println(sample.stripTrailing());
		
		//String.lines() − Return the stream of lines of multi-line string.
		sample = "This\nis\na\nmultiline\ntext.";
		List<String> lines = new ArrayList<>();
		sample.lines().forEach(n-> lines.add(n));
		lines.forEach(System.out::println);

		
		
		
	}

}
