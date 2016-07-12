package misc;

public class DPMinimumJumpsToReachEnd {

	public static void minJump (int arr[], int target) {
		int[] numOfJumps = new int[arr.length];
		int[] actualJump = new int[arr.length];
		
		for (int i=0; i<arr.length; i++)
			numOfJumps[i] = Integer.MAX_VALUE;
		
		if(target>=arr.length)
			return;
		
		for (int i=1; i<=target; i++) {
			
			for (int j=0;j<i;j++) {
				
				if (arr[j]+j>=i) { //We can reach i from j using max of arr[j] jumps.
					if (numOfJumps[i] > (arr[j]+1)) {
						Math.min(numOfJumps[i], arr[j]+1);
						actualJump[i] = j;
					}
				}				
				
			}			
		}
		
		for (int i=0; i<arr.length; i++)
			System.out.print(i + "=" + actualJump[i]+" ");
	}
	
	public static void main (String args[]) {
		int[] arr = {2,3,1,1,2,4,2,0,1,1};
		minJump(arr, 9);
	}
	
}
