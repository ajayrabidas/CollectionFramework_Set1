package com.practice.collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {
	
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<Integer>();
		
		ints.add(1);
		ints.add(2);
		ints.add(3);	ints.add(4);	ints.add(5);
		ints.add(6);	ints.add(7);	ints.add(8);
		ints.add(9);	ints.add(10);	ints.add(11);
		
		System.out.println(ints);
		
		Iterator<Integer> it = ints.iterator();
		
		while(it.hasNext()){
			int x = it.next();
			
			if(x % 2 == 0 ){
				it.remove();
		}
		System.out.println(ints);
		
		it = ints.iterator();
		while(it.hasNext()){
			int y = (int) it.next();
			if(y % 3 == 0 ){
//				it.remove(); // works fine
				ints.add(55); // ConcurrentModificationException
			}
		}
		System.out.println(ints);
	}
	
}
	}
