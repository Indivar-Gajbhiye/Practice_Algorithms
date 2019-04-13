package com.practice.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// Time Complexity : O(n log n)
		int[] arr = { 9, 7, 3, 1, 6, 21, 11, 3, 2, 6, 21, 8, 9, 2, 3, 0 };
		mergeSortEasy(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSortEasy(int inputArray[], int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;

		mergeSortEasy(inputArray, start, mid);
		mergeSortEasy(inputArray, mid + 1, end);
		
		merge(inputArray, start, mid, end);

	}

	private static void merge(int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];

		// index counter for the left side of the array.
		int leftSlot = start;
		// index counter for the right side of the array.
		int rightSlot = mid + 1;

		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			
			k++;
		}

		if (leftSlot <= mid) { // the right side done being sorted. Left must be
								// sorted already.
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) { // the left side done being sorted. Right
										// must be sorted already.
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}

		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}

	private static void mergeSort(int[] arr, int lowIndex, int highIndex) {

		int n = highIndex - lowIndex;
		if (n <= 1) {
			return;
		}

		int midIndex = lowIndex + n / 2;
		mergeSort(arr, lowIndex, midIndex);
		mergeSort(arr, midIndex, highIndex);

		// Merge the two sub arrays
		int[] mergedArray = new int[n];
		int i = lowIndex, j = midIndex;

		for (int k = 0; k < n; k++) {

			if (i == midIndex) {
				mergedArray[k] = arr[j];
				j++;
			} else if (j == highIndex) {
				mergedArray[k] = arr[i];
				i++;
			} else if (arr[j] < arr[i]) {
				mergedArray[k] = arr[j];
				j++;
			} else {
				mergedArray[k] = arr[i];
				i++;
			}
		}

		for (int k = 0; k < n; k++) {
			arr[lowIndex + k] = mergedArray[k];
		}
	}

}
