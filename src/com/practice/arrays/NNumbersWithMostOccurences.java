package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NNumbersWithMostOccurences {

	public static void main(String[] args) {
		int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
		determineFrequency(arr, 4);
	}

	private static void determineFrequency(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int n= arr.length;
		
		for (int i = 0; i < n; i++) {
			Integer value = map.putIfAbsent(arr[i], 1);
			if (value != null) {
				map.put(arr[i], ++value);
			}
		}
		
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, (e1, e2) -> {
			if (e1.getValue() == e2.getValue()) {
				return e2.getKey().compareTo(e1.getKey());
			}
			return e2.getValue().compareTo(e1.getValue());
		});
		
		list.stream().limit(k).forEach(e -> System.out.println(e.getKey()));
	}
}
