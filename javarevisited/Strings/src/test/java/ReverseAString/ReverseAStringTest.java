package ReverseAString;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseAStringTest {

	@Test
	public void Check_RecursionEmptyString_Reversed() {
		assertEquals("", ReverseAString.Solution.reverseRecursion(""));
	}
	
	@Test
	public void Check_RecursionNonEmptyString_Reversed() {
		assertEquals("olleh", ReverseAString.Solution.reverseRecursion("hello"));
	}
	
	@Test
	public void Check_IterativeEmptyString_Reversed() {
		assertEquals("", ReverseAString.Solution.reverseIterative(""));
	}
	
	@Test
	public void Check_IterativeNonEmptyString_Reversed() {
		assertEquals("olleh", ReverseAString.Solution.reverseIterative("hello"));
	}

}
