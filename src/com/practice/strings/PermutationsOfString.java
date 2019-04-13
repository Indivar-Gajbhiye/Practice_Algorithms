package com.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
	
	public static List<String> permutationFinder(String str) {
        List<String> perm = new ArrayList<>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        
        List<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
    	int [] i = new int[0];
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        String s3 = "AB";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s3));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }
}
