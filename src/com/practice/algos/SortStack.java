package com.practice.algos;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(7);
		stack.push(54);
		stack.push(71);
		stack.push(21);
		stack.push(10);
	
		sortStack(stack);
		//System.out.println(stack);
	}

	private static void sortStack(Stack<Integer> inputStack) {
		Stack<Integer> tempStack = new Stack<>();
		
		while (!inputStack.isEmpty()) {
			int val = inputStack.pop();

			while (!tempStack.isEmpty() && tempStack.peek() > val) {
				inputStack.push(tempStack.pop());
			}
			tempStack.push(val);
		}
		
		System.out.println(tempStack);
	}
}
