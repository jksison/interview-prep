import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class StringTests {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

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

	@Test
	public void testDuplicateCharacters() {
		assertFalse(DuplicateCharacters.Solution.hasDuplicateCharacters("wrdo"));
		assertFalse(DuplicateCharacters.Solution.hasDuplicateCharacters("1234"));
		assertFalse(DuplicateCharacters.Solution.hasDuplicateCharacters("helo"));

		assertTrue(DuplicateCharacters.Solution.hasDuplicateCharacters("Programming"));
		assertTrue(DuplicateCharacters.Solution.hasDuplicateCharacters("Combination"));
		assertTrue(DuplicateCharacters.Solution.hasDuplicateCharacters("Java"));
	}

	@Test
	public void testDuplicateCharactersMap() {

		String testStr = "wrdo";
		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('w', 1);
		expected.put('r', 1);
		expected.put('d', 1);
		expected.put('o', 1);

		Map<Character, Integer> result = DuplicateCharacters.Solution.getCharactersCount(testStr);

		assertThat(result, is(expected));

		testStr = "Java";
		expected = new HashMap<Character, Integer>();
		expected.put('J', 1);
		expected.put('a', 2);
		expected.put('v', 1);

		result = DuplicateCharacters.Solution.getCharactersCount(testStr);

		assertThat(result, is(expected));

	}

	@Test
	public void testNonRepeatingCharacterException() {
		exception.expect(RuntimeException.class);
		NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("");
	}

	@Test
	public void testNonRepeatingCharacterFirst() {
		exception.expect(RuntimeException.class);
		NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("");
	}

	@Test
	public void testFirstNonRepeatedCharacter() {
		assertEquals('b', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("abcdefghija"));
		assertEquals('h', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("hello"));
		assertEquals('J', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("Java"));
		assertEquals('i', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("simplest"));
	}

}
