package ctci.recursionAndDP;

public class Q98NCentsRepresentation {
	public static void main (String args[]){
		//System.out.println(nCents(11));
		System.out.println(selfNCents(6, new int[7]));
	}
	
	public static int nCents(int n){
		if (n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else
			return nCents(n-25) + nCents(n-10) + nCents(n-5) + nCents(n-1);
	}
	
	public static int selfNCents (int n, int[] arr){
		
		if(n<0)
			return 0;
		if(n==0) {
			return 1;
		}
		else if (arr[n]>0)
			return arr[n];
		else {
			
			arr[n] = selfNCents(n-5, arr) + selfNCents(n-1, arr);
			return arr[n];
		}
	}
}
