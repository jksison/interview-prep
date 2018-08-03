import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

/*
 * When_Given_Then
 * UnitOfWork_StateUnderTest_ExpectedBehavior.
 * Act_Arrange_Assert
 * Unit_StateBefore_StateAfter
 * Method_Precondition_Postcondition
 */

public class StringTests {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void Anagram_Check_SameOneLetter_True() {
		assertTrue(Anagram.Solution.isAnagram("a", "a"));
	}
	
	@Test
	public void Anagram_Check_DifferentLetters_False() {
		assertFalse(Anagram.Solution.isAnagram("pure", "in"));
	}
	
	@Test
	public void Anagram_Check_SameLettersButDifferentLength_False() {
		assertFalse(Anagram.Solution.isAnagram("b", "bbb"));
	}

	@Test
	public void Anagram_Check_SameLettersAndSameLength_True() {
		assertTrue(Anagram.Solution.isAnagram("mary", "army"));
	}

	@Test
	public void DuplicateCharacters_Check_NoDuplicateCharacters_True() {
		assertTrue(!DuplicateCharacters.Solution.hasDuplicateCharacters("wrdo"));
	}
	
	@Test
	public void DuplicateCharacters_Check_HasDuplicateCharacters_False() {
		assertFalse(!DuplicateCharacters.Solution.hasDuplicateCharacters("Java"));
	}

	@Test
	public void DuplicateCharacters_Check_SameCharactersCount_True() {
		String testStr = "Java";
		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('J', 1);
		expected.put('a', 2);
		expected.put('v', 1);

		Map<Character, Integer> result = DuplicateCharacters.Solution.getCharactersCount(testStr);

		assertThat(result, is(expected));
	}

	@Test
	public void NonRepeatingCharacter_Check_EmptyString_Exception() {
		exception.expect(RuntimeException.class);
		NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("");
	}

	@Test
	public void NonRepeatingCharacter_Check_FirstNonRepeatingCharacter_NotFirstCharacter() {
		assertEquals('b', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("abcdefghija"));
	}

	@Test
	public void NonRepeatingCharacter_Check_FirstNonRepeatingCharacter_FirstCharacter() {
		assertEquals('h', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("hello"));
	}
	
	@Test
	public void ReverseAString_Check_RecursionEmptyString_Reversed() {
		assertEquals("", ReverseAString.Solution.reverseRecursion(""));
	}
	
	@Test
	public void ReverseAString_Check_RecursionNonEmptyString_Reversed() {
		assertEquals("olleh", ReverseAString.Solution.reverseRecursion("hello"));
	}
	
	@Test
	public void ReverseAString_Check_IterativeEmptyString_Reversed() {
		assertEquals("", ReverseAString.Solution.reverseIterative(""));
	}
	
	@Test
	public void ReverseAString_Check_IterativeNonEmptyString_Reversed() {
		assertEquals("olleh", ReverseAString.Solution.reverseIterative("hello"));
	}
}
