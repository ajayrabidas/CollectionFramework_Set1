package com.practice.collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfact {

	
	public static void main(String[] args) {
	
		List<String> li = new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		
		Iterator<String> it = li.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
}
}
