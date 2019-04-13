package com.practice.sesrch;

public class BinarySearchRecursive {
	
	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int[] { 4, 21, 33, 49, 71, 121, 222 }, 0, 6, 49));
	}
	
	private static int recursiveBinarySearch(int[] arr, int start, int end, int element) {

		if (start > end) {
			return -1;
		} else {
			int mid = (start + end) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] < element) {
				return recursiveBinarySearch(arr, mid + 1, end, element);
			} else {
				return recursiveBinarySearch(arr, start, mid, element);
			}

		}
	}
	
}
