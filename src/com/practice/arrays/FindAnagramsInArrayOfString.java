package com.practice.arrays;

import java.util.Arrays;

public class FindAnagramsInArrayOfString {

	public static void main(String[] args) {
		printAllAnagrams(new String[] { "cat", "dog", "act", "boat", "aim", "god", "mia" });
	}

	private static void printAllAnagrams(String[] input) {

		// This method has a time complexity of O(n^3)

		for (int i = 0; i < input.length; i++) {
			String current = input[i];
			char[] temp = current.toCharArray();
			Arrays.sort(temp);

			for (int j = i + 1; j < input.length; j++) {
				String next = input[j];
				char[] chars = next.toCharArray();
				Arrays.sort(chars);

				if (chars.length == temp.length && String.valueOf(chars).equals(String.valueOf(temp))) {
					System.out.println(current + " - " + next);
				}
			}
		}
	}
}