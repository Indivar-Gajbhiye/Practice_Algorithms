package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class OneRepeatedNumberInArray {

	public static int findDuplicateNumber(List<Integer> numbers) {

		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public static int getSum(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String a[]) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 2100; i < 3099; i++) {
			numbers.add(i);
		}

		numbers.add(22);
		System.out.println("Duplicate Number: " + findDuplicateNumber(numbers));
	}

}
