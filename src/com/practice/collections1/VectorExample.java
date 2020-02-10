package com.practice.collections1;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
	
		v.ensureCapacity(22);
		System.out.println(v.size());
		v.add("as");
		v.add("the");
		v.add(2, "hello");
		
		System.out.println(v);
		
	}
}
