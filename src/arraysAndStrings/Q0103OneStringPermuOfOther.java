package arraysAndStrings;

public class Q0103OneStringPermuOfOther {

	static String sort (String s1) {
		char[] c1 = s1.toCharArray();
		java.util.Arrays.sort(c1);
		
		return new String (c1);
	}
	
	
	
	public static void main (String args[]) {
		System.out.println(isPermutation("s1", "s2"));
		System.out.println(isPermutation("s1 s2", "s2 s1"));
		
		System.out.println(isPermutationCharArray("s1", "s2"));
		System.out.println(isPermutationCharArray("s1 s2", "s2 s1"));
	}



	private static boolean isPermutation(String string, String string2) {
		return sort(string).equals(sort(string2));
	}
	
	private static boolean isPermutationCharArray (String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length())
			return false;
		
		int[] charsOfString = new int[256];
		
		for (int i=0; i<s1.length(); i++) {
			int c = (int)s1.charAt(i);
			int count = charsOfString[c];
			count += 1;
			charsOfString[c] = count;
		}
		
		for (int i=0; i<s2.length(); i++) {
			int c = (int)s2.charAt(i);
			int count = charsOfString[c];
			count -= 1;
			charsOfString[c] = count;
		}
		
		for (int i=0; i<256; i++) {
			if(charsOfString[i]>0)
				return false;
		}
		
		return true;
	}
	
}
