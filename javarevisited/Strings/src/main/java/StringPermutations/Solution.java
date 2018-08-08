package StringPermutations;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static Set<String> permutate(String str) {
		return permutate("", str);
	}

	private static Set<String> permutate(String perm, String word) {
		Set<String> result = new HashSet<String>();
		if (word.isEmpty()) {
			result.add(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				result.addAll(permutate(perm + word.charAt(i), 
						word.substring(0, i) + word.substring(i + 1, word.length())));
			}
		}
		return result;
	}

}
