package com.practice.collections1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {

		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("Google");
			list.add("Apple");
			list.add("Microsoft");
			list.add("Samsung");
			list.add("Motorola");
			
			list.forEach( x -> {System.out.println("Processing "+x);} );
			// Here Consumer.accept(String) functional interface is used for lambda expression
		}
}
