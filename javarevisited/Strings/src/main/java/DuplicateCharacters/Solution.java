package DuplicateCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public static Map<Character, Integer> getCharactersCount(String str) {
		char[] characters = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character c : characters) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		return charMap;
	}
	
	public static boolean hasDuplicateCharacters(String str) {
		boolean result = false;
		
		for(Integer value: getCharactersCount(str).values()) {
			if (value > 1) {
				result = true;
				break;
			}				
		}
		
		return result;
	}
}
