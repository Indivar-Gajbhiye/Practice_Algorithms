package com.practice.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		// Time Complexity : O(nxn)
		int[] arr = { 8, 5, 1, 3, 9, 6};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		int j, key, temp = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && key < arr[j]) {

				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

				j--;
			}
		}
	}
}
