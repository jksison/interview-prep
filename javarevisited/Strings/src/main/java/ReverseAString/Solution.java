package ReverseAString;

public class Solution {

	public static String reverseRecursion(String str) {
		int len = str.length();
		if (len < 2)
			return str;
		
		return str.substring(len - 1) + reverseRecursion(str.substring(0, len - 1));
	}
	
	public static String reverseIterative(String str) {
		StringBuilder result = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		
		return result.toString();
	}
}
