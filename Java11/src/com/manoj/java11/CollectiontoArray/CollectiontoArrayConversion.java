package com.manoj.java11.CollectiontoArray;

import java.util.Arrays;
import java.util.List;

public class CollectiontoArrayConversion {

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Joe", "Julie");

		// old way before jdk11
		String[] names = namesList.toArray(new String[namesList.size()]);
		System.out.println(names.length);

		// new way in jdk11
		names = namesList.toArray(String[]::new);
		System.out.println(names.length);
	}

}
