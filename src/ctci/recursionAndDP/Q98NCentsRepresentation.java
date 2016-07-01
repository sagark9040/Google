package ctci.recursionAndDP;

public class Q98NCentsRepresentation {
	public static void main (String args[]){
		System.out.println(nCents(11));
	}
	
	public static int nCents(int n){
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else
			return nCents(n-25) + nCents(n-10) + nCents(n-5) + nCents(n-1);
	}
}
