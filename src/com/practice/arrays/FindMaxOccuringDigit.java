package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMaxOccuringDigit {

	public static void main(String[] args) {
		int[] a = { 6, 6, 6,  1, 1, 2, 1, 5, 6, 6, 8, 5, 1, 9, 7, 1 };
		findMaxFrequencyUsingArray(a);
		findMaxFrequencyUsingHashMap(a);
	}
	
	private static void findMaxFrequencyUsingHashMap(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer value = map.putIfAbsent(arr[i], 1);
			if (value != null) {
				map.put(arr[i], ++value);
			}
		}

		Entry<Integer, Integer> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(entry.getKey() + " " + entry.getValue());
	}

	private static void findMaxFrequencyUsingArray(int[] arr) {
		int max = 0;
		int character = 0;
		int count[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int ch = arr[i];
			count[ch] += 1;
		} // for

		for (int i = 0; i < arr.length; i++) {
			int ch = arr[i];
			if (count[ch] > max) {
				max = count[ch];
				character = ch;
			}
		} // for
		
		System.out.println("Digit is: "+character + " and count is: "+max);
	}

}
