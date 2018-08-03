package NonRepeatingCharacter;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static char getFirstNonRepeatingCharacter(String str) {
		if (str == null || str.length() == 0)
			throw new RuntimeException("didn't find any non repeated Character");

		Set<Character> repeating = new HashSet<Character>(); //for speed
		List<Character> nonRepeating = new LinkedList<Character>();
		for (Character chr: str.toCharArray()) {
			if (repeating.contains(chr)) { //for speed
                continue;
            }
			if (nonRepeating.contains(chr)) {
				nonRepeating.remove((Character) chr);
				repeating.add(chr);
			} else {
				nonRepeating.add(chr);
			}
		}
		return nonRepeating.get(0);

	}
}
