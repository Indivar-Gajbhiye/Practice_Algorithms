package com.practice.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// Time Complexity : O(nxn)

		int[] arr = { 7, 8, 5, 4, 9, 2 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {

		int minValue, minIndex, temp = 0;
		/*
		 * Loop through outer loop and store the minimum value after comapring each
		 * value with inner for loop.
		 */
		for (int i = 0; i < arr.length; i++) {
			minValue = arr[i];
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}

			/*
			 * Check if minimum value is first value or not, if it is a first value then no
			 * need to sort. If it it not then we need to swap it with the first unsorted
			 * value.
			 */
			if (minValue < arr[i]) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
