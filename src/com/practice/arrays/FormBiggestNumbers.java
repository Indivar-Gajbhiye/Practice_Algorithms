package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FormBiggestNumbers {

	public static void main(String[] args) {
		int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
		List<Integer> list = new ArrayList<>();
		Arrays.stream(arr).forEach(e -> list.add(e));
		
		determineLargest(list);
		list.stream().forEach(System.out::print);
	}

	private static void determineLargest(List<Integer> list) {
		
		Collections.sort(list, (num1, num2) -> {
			String first = String.valueOf(num1) + String.valueOf(num2);
			String second = String.valueOf(num2) + String.valueOf(num1);

			return second.compareTo(first);
		});
	}

}
