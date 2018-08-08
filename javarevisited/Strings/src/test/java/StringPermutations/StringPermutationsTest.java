package StringPermutations;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.junit.Test;

public class StringPermutationsTest {

	@Test
	public void Permutate_ThreeCharacters_SixPermutations() {
		Set<String> expected = new HashSet<String>();
		expected.add("abc");
		expected.add("acb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");
		
		Set<String> result = StringPermutations.Solution.permutate("abc");
		
		assertEquals(expected, result);

	}

}
