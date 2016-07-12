package misc;

public class Q91ChildNStepsPRACTISE {
	
	public static int steps (int n, int[] map) {
			if (n<0)
				return 0;
			else if (n==0)
				return 1;
			else if (map[n]>-1)
				return map[n];
			else {
				map[n] = steps(n-1, map) + steps(n-2, map) + steps(n-3, map);
				return map[n];
			}
	}
	
	public static void main (String args[]) {
		int n = 4;
		int[] map = {-1, -1, -1, -1, -1};
		System.out.println(steps(n, map));
	}
	
	
}
