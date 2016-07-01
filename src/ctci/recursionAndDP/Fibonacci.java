package ctci.recursionAndDP;

public class Fibonacci {
	public static int fibo (int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			int num = fibo(n-1) + fibo(n-2);
			return num;
		}		
	}
	
	public static long[] fib = new long [51];
	
	public static long fiboDP (int i) {
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		
		if (fib[i] != 0)
			return fib[i];
		
		fib[i] = fiboDP(i-1) + fiboDP (i-2);
		return fib[i];
	}
	
	public static void main (String args[]) {
		
		System.out.println("Recursion (time in ms):");
		long curTime = System.currentTimeMillis();
		System.out.println(fibo (50));
		System.out.println(System.currentTimeMillis() - curTime);
		
		System.out.println("DP (time in ms):");		
		curTime = System.currentTimeMillis();
		System.out.println(fiboDP(50));
		System.out.println(System.currentTimeMillis() - curTime);

	}
}
