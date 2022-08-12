package com.manoj.java11.OptionalEnhancement;

import java.util.Optional;

public class OptionalEnhancement {

	public static void main(String[] args) {
		
		String name = null;
		
		System.out.println("Test isPresent " + !Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());
		
		name ="Manoj";
		
		System.out.println(!Optional.ofNullable(name).isPresent());
		System.out.println(Optional.ofNullable(name).isEmpty());

	}

}
