package ctci.recursionAndDP;

public class Q93MagicIndexMatchesWithValue {

	public static int[] A = {-20, -10, 0, 1, 2, 3, 4, 5, 8, 10};
			
		//Duplicates {-20, -10, 0, 3, 3, 3, 4, 5, 18, 20};
	
	public static int binSearch (int low, int high) {
		
		if (low > high)
			return -1;
		
		int mid = (low + high)/2;
		
		if (A[mid] == mid)
			return mid;
		
		int left = binSearch (low, mid-1);
		int right = binSearch (mid+1, high);
		
		return left!=-1 ?left: right;
		
	}
	
	public static void main (String args[]) {
		System.out.println(binSearch(0,9));
	}
	
}
