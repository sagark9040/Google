package arraysAndStrings;

import java.util.HashSet;

public class Q0101StringUniqueCharacters {

	/*
	 * Returns true if string has all unique characters. False otherwise.
	 * HashSet used here.
	 */
	public static boolean isUnique (String str) { 
		
		HashSet<Character> charsFound = new HashSet<Character>(); 
		
		for (int i=0; i<str.length(); i++) {
			if (charsFound.contains(str.charAt(i)))
				return false;
			
			charsFound.add(str.charAt(i));
		}
		
		return true;		
	}
	
	public static boolean isUniqueNoDataStructure (String str) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;	
	}
	
	public static void main (String args[]) {
		System.out.println(isUnique(""));
		System.out.println(isUnique("a"));
		System.out.println(isUnique("ab"));
		System.out.println(isUnique("aba"));
		System.out.println(isUnique(" "));
		System.out.println(isUnique(" a "));
		System.out.println(isUnique("sagr"));
		System.out.println("-----");
		System.out.println(isUniqueNoDataStructure(""));
		System.out.println(isUniqueNoDataStructure("a"));
		System.out.println(isUniqueNoDataStructure("ab"));
		System.out.println(isUniqueNoDataStructure("aba"));
		System.out.println(isUniqueNoDataStructure(" "));
		System.out.println(isUniqueNoDataStructure(" a "));
		System.out.println(isUniqueNoDataStructure("sagr"));		
	}
	
}
