package DuplicateCharacters;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DuplicateCharactersTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void Check_NoDuplicateCharacters_True() {
		assertTrue(!DuplicateCharacters.Solution.hasDuplicateCharacters("wrdo"));
	}
	
	@Test
	public void Check_HasDuplicateCharacters_False() {
		assertFalse(!DuplicateCharacters.Solution.hasDuplicateCharacters("Java"));
	}

	@Test
	public void Check_SameCharactersCount_True() {
		String testStr = "Java";
		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('J', 1);
		expected.put('a', 2);
		expected.put('v', 1);

		Map<Character, Integer> result = DuplicateCharacters.Solution.getCharactersCount(testStr);

		assertThat(result, is(expected));
	}
}
