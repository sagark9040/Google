package arraysAndStrings;

public class Q0105StringCompress {

	public static String compress (String str) {
		if (null == str || str.length() < 3)
			return str;
		
		str = str.toLowerCase();
		
		StringBuffer newStr = new StringBuffer();
		
		char current = str.charAt(0);
		int count = 1;		
		
		for (int i=1; i<str.length(); i++) {
			if (str.charAt(i) == current)
				count++;
			
			else {
				newStr.append(current);
				newStr.append(count);
				current = str.charAt(i);
				count = 1;
			}
		}
		
		newStr.append(current);
		newStr.append(count);
		
		if (newStr.length() >= str.length())
			return str;
			
		return new String (newStr);
	}
	
	public static void main (String args[]) {
		System.out.println(compress(null));
		System.out.println(compress("aaAbCCDdEee"));
	}
}
