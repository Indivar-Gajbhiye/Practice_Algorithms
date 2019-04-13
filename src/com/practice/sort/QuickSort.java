package com.practice.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 3, 1, 6, 21, 11, 3, 2, 6, 21, 8, 9, 2, 3, 0 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if (start < end) {
			
			//  determines index position of the correctly placed value in the array
			int partition = partition(arr, start, end); 
			quickSort(arr, start, partition - 1); // sorts the left half of the range
			quickSort(arr, partition + 1, end); // sorts the right half of the range
		}
	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int i = start - 1;
		
		for (int j = start; j <= end - 1; j++) {

			if (arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		// put the pivot value in the correct position and then return the position 
		int temp = arr[i + 1];
		arr[end] = temp;
		arr[i + 1] = pivot;
		
		return i + 1;
	}

}
