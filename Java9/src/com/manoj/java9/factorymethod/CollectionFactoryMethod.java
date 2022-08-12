package com.manoj.java9.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethod {

	public static void main(String[] args) {

		/*
		 * Set<String> st = new HashSet<String>(); st.add("Manoj"); st.add("Ishu");
		 * st.add("Kumar"); st.add("Sharma");
		 * 
		 * st= Collections.unmodifiableSet(st); System.out.println("Set Impl = ");
		 * st.stream().forEach(System.out::println);
		 * 
		 * List<String> list = new ArrayList<>(); list.add("Jeep"); list.add("Car");
		 * list.add("Truck"); System.out.println("List Impl");
		 * list.stream().forEach(System.out::println);
		 * 
		 * Map<Integer, String> map = new HashMap<>(); map.put(1, "Amaze"); map.put(2,
		 * "Honda"); map.put(3, "City"); map = Collections.unmodifiableMap(map);
		 * 
		 * System.out.println("Map Impl"); System.out.println(map);
		 */

		// .of is factory method
		Set<String> st = Set.of("Manoj", "Kumar", "Hello");
	    System.out.println("Map Impl"); 
		 System.out.println(st);
		
		
				
	}

}
