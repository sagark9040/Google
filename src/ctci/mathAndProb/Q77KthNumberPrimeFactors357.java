package ctci.mathAndProb;

import java.util.LinkedList;
import java.util.Queue;

public class Q77KthNumberPrimeFactors357 {

	public static int removeMin(Queue<Integer> q ) { int min = q.peek();
		for (Integer v : q) {
			if (min>v){
				min = v;
			}
		}
		while (q.contains(min)) {
	
			q.remove(min);
		}
		return min;
	}

	public static void addProducts(Queue<Integer> q, int v) {
		q.add(v * 3);
		q.add(v * 5);
		q.add(v * 7);
	}

	public static int getKthMagicNumber(int k) {
		if (k < 0) return 0;

		int val = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		addProducts(q, 1);
		for (int i = 0; i < k; i++) {
			val = removeMin(q);
			addProducts(q, val);
		}
		
		return val;
	}
	
	public static void main (String args[]) {
		System.out.println("kth number:" + getKthMagicNumber(9));
	}
}
