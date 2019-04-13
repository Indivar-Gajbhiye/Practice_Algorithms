package com.practice.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayQuadruple {

	public static void main(String[] args) {
		int arr[] = {3, 4, 7, 1, 2, 9, 8}; 
        determinePairs(arr); 
	}

	private static boolean determinePairs(int[] arr) {
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>(); 
		int n = arr.length;
		for (int i=0; i<n; ++i) 
        { 
            for (int j=i+1; j<n; ++j) 
            { 
                // If sum of current pair is not in hash, 
                // then store it and continue to next pair 
                int sum = arr[i]+arr[j]; 
				if (!map.containsKey(sum)) {
					map.put(sum, Stream.of(arr[i], arr[j]).collect(Collectors.toList()));
				}
                else // Else (Sum already present in hash) 
                { 
                    // Find previous pair 
                    List<Integer> perviousNumbers = map.get(sum); 
  
                    // Since array elements are distinct, we don't 
                    // need to check if any element is common among pairs 
					System.out.println("(" + perviousNumbers.get(0) + ", " + perviousNumbers.get(1) + ") and (" + arr[i]
							+ ", " + arr[j] + ")");
					
                    return true; 
                } 
            } 
        } 
        return false; 
	} 
}
