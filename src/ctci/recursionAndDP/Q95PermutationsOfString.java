package ctci.recursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class Q95PermutationsOfString {
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++) {
	        	String toPrint = "i="+i + " charAt("+i+")="+str.charAt(i) +
	        			" str.substring(0, " + i + ")=" + str.substring(0, i) + " str.substring(" +i+ "+1," + n + ")="+str.substring(i+1, n);
	        	System.out.print(toPrint + "\n");
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
	public static void main (String args[]) {
		//permutation("abcd");
		List<String> allPerms = permuteString("abcd");
		for (String s:allPerms)
			System.out.println(s);
	}
	
	public static List<String> permuteString(String s) {
		 
	    List<String> stringPermutations = new ArrayList<>(); 
	    if (s == null || s.length() == 0) {
	        return null;
	    } else if (s.length() == 1) {
	        stringPermutations.add(s);
	        return stringPermutations;
	    } else { 
	        // Any character can be left out from the string
	        // For simplicity, leaving out the first character
	        char c = s.charAt(0); 
	        List<String> postfixPermutations = 
	        		permuteString(s.substring(1));
	        for (String sub : postfixPermutations) {
	            for (int position = 0 ; position < sub.length() + 1; position++) {
	                String prefix = sub.substring(0,position);
	                String postfix = sub.substring(position, sub.length());  
	                String permutedString = prefix + c + postfix; 
	                stringPermutations.add(permutedString); 
	            }
	        }   
	    }
	    return stringPermutations;
	}
	
}
