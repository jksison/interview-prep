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
	
	@Test
	public void Permutate_FourCharacters_SixPermutations() {
		Set<String> expected = new HashSet<String>();
		
		expected.add("acbd");
		expected.add("adbc");
		expected.add("bcad");
		expected.add("bdac");
		expected.add("cbad");
		expected.add("cdab");
		expected.add("abdc");
		expected.add("acdb");
		expected.add("bacd");
		expected.add("bdca");
		expected.add("cabd");
		expected.add("cdba");
		expected.add("dbac");
		expected.add("dcab");
		expected.add("abcd");
		expected.add("adcb");
		expected.add("badc");
		expected.add("bcda");
		expected.add("dabc");
		expected.add("dcba");
		expected.add("cadb");
		expected.add("cbda");
		expected.add("dacb");
		expected.add("dbca");
		
		Set<String> result = StringPermutations.Solution.permutate("abcd");
		
		
		assertEquals(expected, result);

	}

}
