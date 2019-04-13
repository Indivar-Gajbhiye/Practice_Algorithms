package com.practice.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 5, 4, 9, 2 };
		// Time Complexity : O(nxn)
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
