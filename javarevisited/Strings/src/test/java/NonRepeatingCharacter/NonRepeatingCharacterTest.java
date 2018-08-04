package NonRepeatingCharacter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NonRepeatingCharacterTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void Check_EmptyString_Exception() {
		exception.expect(RuntimeException.class);
		NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("");
	}

	@Test
	public void Check_FirstNonRepeatingCharacter_NotFirstCharacter() {
		assertEquals('b', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("abcdefghija"));
	}

	@Test
	public void Check_FirstNonRepeatingCharacter_FirstCharacter() {
		assertEquals('h', NonRepeatingCharacter.Solution.getFirstNonRepeatingCharacter("hello"));
	}

}
