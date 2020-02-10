package com.practice.collections1;

import java.util.Stack;

public class StackExample {

	public void stack_push(Stack<Integer> stack) {
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		System.out.println(stack);
	}
	private void stack_peek(Stack<Integer> stack) {
		Integer x = (Integer) stack.peek();
		System.out.println("top is: "+x);
	}
	
	private void stack_pop(Stack<Integer> stack) {
		System.out.println(stack);
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println("POP "+y);
		}
	}


	private void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);
		System.out.println(stack);
		if (pos == -1) {
			System.out.println("not found");
		} else System.out.println("found at " + pos);
	}
	
	public static void main(String[] args) {
		
		StackExample st = new StackExample();
		Stack<Integer> stack1 = new Stack<Integer>();
		
		st.stack_push(stack1);
		st.stack_peek(stack1);
		st.stack_pop(stack1);
		st.stack_push(stack1);
		st.stack_search(stack1, 2);
	}
}
