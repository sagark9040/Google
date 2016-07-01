package ctci.recursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class Q96ParenthesesValidCombination {

	public static void main (String args[]) {
		int n = 4;
		char[] str = new char[n*2];
		List<String> perms = new ArrayList<String>();
		
		
		List<String> validParenthesesCombo = permParentheses(
				perms, str, n, n, 0);
		
		for (String s: validParenthesesCombo)
			System.out.println(s);
	}

	private static List<String> permParentheses(List<String> list, char[] str, int leftRem, int rightRem, int count) {

		if (leftRem < 0 || leftRem > rightRem)
			return null;
		
		if (leftRem == 0 && rightRem == 0) {
			list.add(String.valueOf(str));
		}
		else {
			if (leftRem > 0) {
				str[count] = '(';
				permParentheses(list, str, leftRem-1, rightRem, count+1);
			}
			if (rightRem > leftRem) {
				str[count] = ')';
				permParentheses(list, str, leftRem, rightRem-1, count+1);
			}
		}		
		
		return list;
	}	
	
	
}

