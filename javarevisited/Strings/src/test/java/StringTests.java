import static org.junit.Assert.*;

import org.junit.Test;

public class StringTests {

	@Test
	public void testAnagram() {
		assertTrue(Anagram.Solution.isAnagram("word", "wrdo"));
		assertTrue(Anagram.Solution.isAnagram("mary", "army"));
		assertTrue(Anagram.Solution.isAnagram("stop", "tops"));
		assertTrue(Anagram.Solution.isAnagram("boat", "btoa"));
		assertFalse(Anagram.Solution.isAnagram("pure", "in"));
		assertFalse(Anagram.Solution.isAnagram("fill", "fil"));
		assertFalse(Anagram.Solution.isAnagram("b", "bbb"));
		assertFalse(Anagram.Solution.isAnagram("ccc", "ccccccc"));
		assertTrue(Anagram.Solution.isAnagram("a", "a"));
		assertFalse(Anagram.Solution.isAnagram("sleep", "slep"));
	}

}
