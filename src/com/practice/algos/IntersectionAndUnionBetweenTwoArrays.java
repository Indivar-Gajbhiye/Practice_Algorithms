package com.practice.algos;

import java.util.Arrays;

public class IntersectionAndUnionBetweenTwoArrays {

	public static void main(String[] args) {
		/*System.out
				.println(Arrays.toString(intersection(new int[] { 10, 21, 3, 5, 17 }, new int[] { 2, 8, 10, 5, 11 })));*/
		
		unionAndIntersectionOfTtwoSortedArrays(new int[] { 10, 21, 3, 5, 17 }, new int[] { 2, 8, 10, 5, 11 });
	}
	
	private static void unionAndIntersectionOfTtwoSortedArrays(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String union = "";
		String intersection = "";

		int i = 0;
		int j = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				//union += arr1[i] + " ";
				intersection += arr1[i] + " ";
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				union += arr1[i++] + " ";
			} else {
				union += arr2[j++] + " ";
			}
		}

		if (i < arr1.length) {
			while (i < arr1.length) {
				union += arr1[i++];
			}
		}

		if (j < arr2.length) {
			while (j < arr2.length) {
				union += arr2[j++];
			}
		}

		System.out.println("union : " + union);
		System.out.println("intersection : " + intersection);
	}
	
	private static int[] intersection(int[] a, int[] b) {
		return Arrays.stream(a)
				.distinct()
				.filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
				.toArray();
	}
}
