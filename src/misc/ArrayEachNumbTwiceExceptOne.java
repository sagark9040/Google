package misc;

public class ArrayEachNumbTwiceExceptOne {
	public static void main (String args[]) {
		int[] arr = {1,2,3,4,9,4,3,2,1,2,2,7,7,9,0,-1,0};
		int res = 0;
		for (int i=0; i<arr.length; i++)
			res = arr[i]^res;
		
		System.out.println(res);
		
		System.out.println("--\nBit differences");
		System.out.println(8^8);
	}
}
