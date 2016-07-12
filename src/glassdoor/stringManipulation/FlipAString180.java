package glassdoor.stringManipulation;

public class FlipAString180 {

	public static void main (String args[]) {
		System.out.println(flip (""));
		System.out.println(flip ("s"));
		System.out.println(flip ("ss"));
		System.out.println(flip ("sagar"));
		System.out.println(flip ("sag ar"));
	}
	
	public static char[] flip (String input) {		
		
		if (null == input || input.length() < 2)
			return input.toCharArray();
		
		int len = input.length();
		
		char[] output = input.toCharArray();
		
		for (int i=0; i < (len/2); i++) {
			output[i] = output[len-1-i];			
		}
		
		return output;
	}
	
}
