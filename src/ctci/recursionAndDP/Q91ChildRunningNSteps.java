package ctci.recursionAndDP;

public class Q91ChildRunningNSteps {
	public static int countWays(int n) {
		if (n<0)
			return 0;
		else if (n==0)
			return 1;
		else {
			System.out.println("n="+n);
			return countWays(n-1)+countWays(n-2)+countWays(n-3);
		}
	}
	
	public static void main (String args[]) {
		System.out.println(countWays(4));
	}
}
