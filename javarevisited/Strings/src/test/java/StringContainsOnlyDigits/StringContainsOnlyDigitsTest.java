package StringContainsOnlyDigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringContainsOnlyDigitsTest {

	@Test
	public void Check_DigitsOnly_True() {
		assertTrue(StringContainsOnlyDigits.Solution.analyse("123456"));
	}

	@Test
	public void Check_HasNonDigits_False() {
		assertFalse(StringContainsOnlyDigits.Solution.analyse("123456abc"));
	}
	
	@Test
	public void Check_DigitsWithANegativeSign_False() {
		assertFalse(StringContainsOnlyDigits.Solution.analyse("-123456"));
	}
	
	@Test
	public void Check_DigitsWithADecimalPoint_False() {
		assertFalse(StringContainsOnlyDigits.Solution.analyse("12.3456"));
	}
	
}
