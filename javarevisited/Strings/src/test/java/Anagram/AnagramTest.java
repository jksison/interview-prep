package Anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void Check_SameOneLetter_True() {
		assertTrue(Anagram.Solution.isAnagram("a", "a"));
	}
	
	@Test
	public void Check_DifferentLetters_False() {
		assertFalse(Anagram.Solution.isAnagram("pure", "in"));
	}
	
	@Test
	public void Check_SameLettersButDifferentLength_False() {
		assertFalse(Anagram.Solution.isAnagram("b", "bbb"));
	}

	@Test
	public void Check_SameLettersAndSameLength_True() {
		assertTrue(Anagram.Solution.isAnagram("mary", "army"));
	}

}
