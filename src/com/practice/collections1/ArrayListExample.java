package com.practice.collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.journaldev.com/11404/java-arraylist
public class ArrayListExample {

	
	public static void main(String args[]) {
		List<String> letters = new ArrayList<String>();
		
		//add example
		letters.add("A");
		letters.add("C");
		letters.add("D");
		System.out.println(letters);
		
		//let's insert B between A and C
		letters.add(1, "B");
		System.out.println(letters);
		
		
		//appending list elements to letters
		List<String> letters2 = new ArrayList<String>();
		letters2.add("E");
		letters2.add("F");
		letters2.add("G");
		
		letters.addAll(letters2);
		System.out.println(letters);
		
		//clear example to empty the list
		letters2.clear();
		System.out.println(letters2);
		
		//inserting list inside letters to get right sequence
		letters2.add("H");
		letters2.add("I");
		letters2.add("J");
		
		letters.addAll(7, letters2);
		System.out.println(letters);
		
		//contains example
		System.out.println(letters.contains("E"));
		
		//ensureCapacity example, it's ArrayList method, so object should be defined like below.
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.ensureCapacity(11);
		System.out.println("list size after ensureCapacity: "+tempList.size());
		
		//get example
		System.out.println(letters.get(4));
		
		
		//tempList is empty?
		System.out.println(tempList.isEmpty());
		
		//indexOf example
		System.out.println(letters.indexOf("E"));
		
		//remove examples
		letters.remove(4);
		System.out.println(letters);
		
		//remove first occurrence of H
		letters.remove(letters.indexOf("H"));
		System.out.println(letters);
		
		//remove all matching elements between letters and list
				letters.removeAll(letters2);
				System.out.println(letters);
				
				//retainAll example
				letters2.clear();letters2.add("A");letters2.add("B");letters2.add("C");
				letters.retainAll(letters2);
				System.out.println("letters elements after retainAll operation: "+letters);
				
				//size example
				System.out.println("letters ArrayList size = "+letters.size());
				
				//set example
				letters.set(2, "D");
				System.out.println(letters);
				
				//toArray example
				String[] strArray = new String[letters.size()];
				strArray = letters.toArray(strArray);
				System.out.println(Arrays.toString(strArray));
				
	}
}
