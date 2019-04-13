package com.practice.algos;

import java.util.Arrays;

public class RearrangeNegPosArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(rearrangePosNeg(new int[] { 12, 5, 15, -3, -9, 10, -3, 10 })));
	}

	private static int[] rearrangePosNeg(int arr[]) {
		int current, j;
		for (int i = 1; i < arr.length; i++) {
			current = arr[i];

			// if current element is positive
			// do nothing
			if (current > 0) {
				continue;
			}
			/*
			 * if current element is negative, shift positive elements of arr[0..i-1], to
			 * one position to their right
			 */
			j = i - 1;
			while (j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j--;
			}

			// Put negative element at its right position
			arr[j + 1] = current;
		}
		return arr;
	}

}
