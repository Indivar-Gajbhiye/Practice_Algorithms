package com.practice.strings;

public class StringToNumber {

	public static void main(String[] args) {
		System.out.println(convertStringToNumber("3296"));
	}

	public static int convertStringToNumber(String numStr) {

		char ch[] = numStr.toCharArray();
		int sum = 0;
		// get ascii value for zero
		int zeroAscii = (int) '0';
		for (char c : ch) {
			int tmpAscii = (int) c;
			sum = (sum * 10) + (tmpAscii - zeroAscii);
		}
		
		return sum;
	}

}
