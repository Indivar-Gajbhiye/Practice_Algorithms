package com.practice.sesrch;

public class LinearchSearchRecursive {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {12, 14 , 3, 71, 23, 41}, 0, 24));
	}

	private static int recursiveLinearSearch(int[] a, int index, int element) {

		if (index > a.length - 1) {
			return -1;
		} else if (a[index] == element) {
			return index;
		} else {
			return recursiveLinearSearch(a, index + 1, element);
		}

	}
}
