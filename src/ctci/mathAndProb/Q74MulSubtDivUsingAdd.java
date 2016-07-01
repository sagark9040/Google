package ctci.mathAndProb;

public class Q74MulSubtDivUsingAdd {
	static int neg (int a) {
		int neg = -1, res = 0;
		
		if (a < 0) {
			for (int i = -1; i >= a; i--)
				res++;
		}
			
		else if (a > 0){		
			for (int i = 1; i <= a; i++)
				res += neg;			
		}
		
		return res;
	}
	
	static int multiply (int a, int b) {
		int sum = 0;
		
		if (a == 0 || b == 0)
			return 0;
		
		else if (a > 0 && b > 0) {
			for (int i = 1; i <= b; i++)
				sum += a;
		}
		
		else if (a > 0 && b < 0) {
			for (int i = 1; i <= a; i++)
				sum += b;
		}
		
		else if (a < 0 && b > 0) {
			for (int i = 1; i <= b; i++)
				sum += a;
		}
		
		else {
			a = neg (a);
			
			for (int i = 1; i <= a; i++)
				sum+= b;
			
			sum = neg(sum);
		}
		
		return sum;
	}
	
	static int subtract (int a, int b) {
		int negOfB = neg(b);
		
		return a + negOfB;
	}
	
	public static void main (String args[]) {
		int a = 5, b = 2;
		System.out.println(multiply(a,b));
		System.out.println(subtract(a,b));
		
		a = 5; b = 0;
		System.out.println(multiply(a,b));
		System.out.println(subtract(a,b));
		
		a = 0; b = 2;
		System.out.println(multiply(a,b));
		System.out.println(subtract(a,b));
		
		a = -5; b = 2;
		System.out.println(multiply(a,b));
		System.out.println(subtract(a,b));
		
		a = 5; b = -2;
		System.out.println(multiply(a,b));
		System.out.println(subtract(a,b));
	}
}
