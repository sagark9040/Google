package glassdoor.graphs;

import java.util.Arrays;

public class PhoneNumbersStartWith5 {
	
	static int[][] neighbors = {{8},{2,4},{1,3,5},{2,6},{1,5,7},{2,4,6,8},{3,5,9},{4,8},{5,7,9,0},{6,8}};
	static long count = 0;
	
	public static void main(String args[]){
		int[] result = new int[10];
		phoneNumbers(5, result, 0);
		System.out.println("Total Combinations:" + count);
	}

	private static void phoneNumbers(int n, int[] result, int i) {
		result[i] = n;
		
		if(i==9) {
			printNumber(result);
			
			return;
		}
		
		for(int j=0;j<neighbors[n].length;j++){
			phoneNumbers(neighbors[n][j], result, i+1);
		}
	}

	private static void printNumber(int[] result) {
		boolean containsZero = false;
		for(int i=0; i<10; i++) {
			if(result[i]==0)
				containsZero = true;
			
			count++;
		}
		
		if(containsZero == true){
			for(int i=0; i<10; i++) {
				System.out.print(result[i]);
			}		
			System.out.println();
		}
	}
	
	
	
}
