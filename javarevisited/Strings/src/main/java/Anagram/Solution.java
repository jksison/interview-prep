package Anagram;

import java.util.Arrays;

public class Solution {

	public static boolean isAnagram(String first, String second) {

		if (first == null || second == null)
			return false;
		else if (first.length() != second.length())
			return false;

		char[] charFromWord = first.toLowerCase().toCharArray();
		char[] charFromAnagram = second.toLowerCase().toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		
		return Arrays.equals(charFromWord, charFromAnagram);
	}
}
