package sortingAndSearching;

public class Q1101InsertMergedArray {

	static void insertMergedArray (int[] A, int[] B) {
		int lastA = A.length - 1;
		int lastB = B.length - 1;
		
		int cur = lastA;
		
		while (A[lastA] == 0 && lastA >0)
			lastA --;
		
		while (lastA >= 0 && lastB >= 0 && cur >=0 ) {
			
			if (A[lastA] < B[lastB]) {
				A[cur] = B[lastB];
				lastB--;
			}
			else {
				int temp = A [lastA];
				A[lastA] = A[cur];
				A[cur] = temp;
				lastA--;
			}
			
			cur --;
		}
		
		while (lastB >=0 ) {
			A[cur] = B[lastB];
			lastB--; cur--;
		}
		
		for (int a:A)
		System.out.println(a);
	}
	
	public static void main (String args[]) {
		int[] A = {1,2,0,0,0};
		int[] B = {-2,-1,1};
	
		insertMergedArray (A, B);
	}
	
}
