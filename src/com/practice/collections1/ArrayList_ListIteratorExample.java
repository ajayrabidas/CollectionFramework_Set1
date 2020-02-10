package com.practice.collections1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIteratorExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		ListIterator<Integer> lit = list.listIterator(list.size()); 
		
		while (lit.hasPrevious()) {
			int x = lit.previous();
			System.out.print(x + " ");
		}
		
		lit = list.listIterator(list.size());
		while (lit.hasPrevious()) {
			if(lit.previous() == 5){
				lit.remove();
				lit.add(99);
			}
		}
		System.out.println(list);
	}
}
