// Write a method which will remove any given character from a String

public class Solution {

	public static void main(String[] args) {
		String str = "test";		
		System.out.println(removeFromStr(str, 'e'));
		
		str = "eteeste";
		System.out.println(removeFromStr(str, 'e'));
		
		str = "nothing";
		System.out.println(removeFromStr(str, 'e'));
		
	}

	private static String removeFromStr(String str, char chr) {
		int len = str.length();
		char newStr[] = new char[len];
		char origChar;
		int origIndex = 0, newIndex = 0;
		
		while (origIndex < len) {
			origChar = str.charAt(origIndex++);
			if (chr == origChar)
				continue;
			newStr[newIndex++] = origChar;  
		}
		
		return String.valueOf(newStr);
	}
}
