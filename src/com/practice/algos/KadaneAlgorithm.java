package com.practice.algos;

public class KadaneAlgorithm {

	public static void main(String[] args) throws ClassNotFoundException {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		System.out.println(findMaxSumIndex(arr));
	}

	private static int findMaxSumIndex(int[] arr) {
		int maxSum = Integer.MIN_VALUE;

		int tempSum = 0;

		for (int i = 0; i < arr.length; i++) {
			tempSum = tempSum + arr[i];

			if (tempSum > maxSum) {
				maxSum = tempSum;
			}

			/*
			 * When the sum is negative, reset the sum to zero
			 */
			if (tempSum < 0) {
				tempSum = 0;
			}
		}

		return maxSum;
	}
}
