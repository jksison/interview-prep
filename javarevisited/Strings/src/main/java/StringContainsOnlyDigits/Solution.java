package StringContainsOnlyDigits;

import java.util.regex.Pattern;

public class Solution {

	public static boolean analyse(String str) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");		
		return !pattern.matcher(str).matches();
	}
}
