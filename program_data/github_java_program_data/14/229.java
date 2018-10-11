package com.datastructures.nexus;

import java.util.HashMap;

public class Permutation {

	public boolean checkPermutation(String input1, String input2) {

		if (input1.length() != input2.length()) {
			return false;
		}

		int len1 = input1.length();
		int len2 = input2.length();

		HashMap<Character, Integer> mapper = new HashMap<Character, Integer>();

		// Add all characters with their count
		for (int counter = 0; counter < len1; counter++) {
			char key = input1.charAt(counter);
			if (mapper.containsKey(key)) {
				mapper.put(key, mapper.get(key) + 1);
			} else {
				mapper.put(key, 1);
			}
		}

		// Decrement the count of the character in map
		for (int counter = 0; counter < len2; counter++) {
			char key = input2.charAt(counter);
			if (mapper.containsKey(key)) {
				mapper.put(key, mapper.get(key) - 1);
			} else {
				return false;
			}
		}

		// Check if count of character is 0.
		for (int val : mapper.values()) {
			if (val != 0)
				return false;
		}
		return true;
	}
}
