package com.practice.algos;

import java.util.Stack;

public class ValidateParanthesis {

	public static void main(String[] args) {
		System.out.println(validateString("(A+B)*(A-B)"));
		System.out.println(validateString("(A+B))*(A-B)"));
		System.out.println(validateString("(A+B))*((A-B)"));
		System.out.println(validateString("(A+B)*(B)* (A-B)-(B)"));
		System.out.println(validateString("(A+B)*(B)- (A))"));
	}
	
	private static boolean validateString(String input) {

		Stack<Character> stack = new Stack<>();
		for (Character ch : input.toCharArray()) {
			stack.push(ch);
		}

		while (!stack.isEmpty()) {
			Character character = stack.pop();
			if (character == '(') {
				return false;
			}
			else if (character == ')') {
				while (!stack.isEmpty()) {
					Character anotherCharacter = stack.pop();
					if(anotherCharacter == '(') {
						break;
					}
					else if(anotherCharacter == ')') {
						return false;
					}
				}
			}
		}

		return true;
	}
}
