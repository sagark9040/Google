package misc;

public class NegateANumber {
	public static int negate (int num) {
		int neg = -1;
		int res = 0;
		
		if (num > 0) {
		
			for (int i=0; i<num; i++)
				res += neg;
			
		}
		
		else {
			
			for (int i=0; i>num; i--)
				res -= neg;		
			
		}
			
		
		return res;
	}
	
	public static void main (String args[]) {
		System.out.println(negate(-25));
		System.out.println(negate(51));
	}
}
