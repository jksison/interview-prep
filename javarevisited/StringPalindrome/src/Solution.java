//  Write code to check a String is palindrome or not without StringBuffer.

public class Solution {

	public static void main(String[] args) {
		String str = "JohnWick";
		System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
		
		str = "strrts";
		System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
		
		str = "str rts";
		System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
		
		str = "abcba";
		System.out.println("\"" + str + "\" is a palindrome: " + isPalindrome(str));
		
	}
	
	private static boolean isPalindrome(String word) {
		return word.equalsIgnoreCase(reverse(word));
	}
	
	private static String reverse(String word) {
		if (word == null || word.isEmpty()) 
			return word;
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}		
		return reverse;
	}

}
