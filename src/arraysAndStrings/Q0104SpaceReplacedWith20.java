package arraysAndStrings;

public class Q0104SpaceReplacedWith20 {
	
	public static String replaceWith20 (String str, int trueLen) throws Exception {
		char[] finalStr = str.toCharArray();
		int t = trueLen-1;
		int f = str.length()-1;
		int countSpaces = 0;

		if (str.length() < trueLen) 
			throw new Exception ("Not enough filler spaces provided.");
		
		for (int i=0; i<=t; i++) { //First iteration to count spaces to assist general error check.
			if(finalStr[i] == ' ')
				countSpaces++;
		}
		
		if ((trueLen + 2*countSpaces) > str.length())
			throw new Exception ("Not enough filler spaces provided.");
		
		while (t>=0 && f>=0) {
			if (finalStr[t] == ' ') {
				finalStr[f-2] = '%';
				finalStr[f-1] = '2';
				finalStr[f] = '0';
				f = f-3;
				t = t-1;
			}
			else {
				finalStr[f] = finalStr[t];
				f--; t--;
			}
		}
		return new String (finalStr);
	}
	
	public static void main (String args[]) {
		try {			
			System.out.println(replaceWith20("abcde fghij  ", 11));
			System.out.println(replaceWith20("ab  cd  ef           ", 11));
			System.out.println(replaceWith20("    ", 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
