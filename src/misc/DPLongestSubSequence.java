package misc;

public class DPLongestSubSequence {

	public static void longestSubsequence (int[] arr) {
		int maxStart = 0, maxEnd = 0, maxCount = 1;
		int curStart = 0, curEnd = 0, curCount = 1;
		
		if (arr.length == 0) { //Error scenario. Can't be handled differently.
			System.out.println("Empty array!");
			return;
		}
		
		if (arr.length == 1) { //Array of length 1 is the longest subsequence itself.
			printLongestSubseq (arr, maxStart, maxEnd);
			return;
		}
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] >= arr[i-1]) { //Increasing subsequence
				
				curEnd = i;
				curCount ++;
				
			}
			
			else { //Reset 
				
				curStart = i;
				curEnd = i;
				curCount = 1;
				
			}
			
			if (curCount > maxCount) {
				
				maxStart = curStart;
				maxEnd = curEnd;
				maxCount = curCount;
				
			}
		}
		
		printLongestSubseq (arr, maxStart, maxEnd);
	}
	
	public static void printLongestSubseq (int[] arr, int start, int end) {
		for (int i=start; i<=end; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	public static void main (String args[]) {
		
		int[] arr = {}; //Empty array
		longestSubsequence(arr);
		
		int[] arr2 = {-2}; //Length one array
		longestSubsequence(arr2);
		
		int[] arr3 = {1,2,0,-2,5,6,7,6,7,8}; //Reg array
		longestSubsequence(arr3);
		
		int[] arr4 = {1,1,1,1}; //Same elements in array
		longestSubsequence(arr4);
		
	}
}
