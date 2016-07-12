package glassdoor.arrays;
import java.util.Arrays;

public class SwapWithZeroOrParkingSpotSwapProblem {
	
	public static void main(String[] args){
	SwapWithZeroOrParkingSpotSwapProblem t = new SwapWithZeroOrParkingSpotSwapProblem();
		
		int[] x ={4,5,5,1,7,3,2,0};
		int[] y ={0,1,2,3,7,6,5,4};
		t.swapWithZero(x, y);
		
		System.out.println();
		
		int[] a ={0,2,1,3};
		int[] b ={0,2,3,1};
		t.swapWithZero(a, b);
		
		
		
	}
	

public void swapWithZero(int[] src, int[] tgt){
	if(src == null || tgt == null || src.length != tgt.length)
		return;

	int zeroIndex = -1;
	for(int i =0; i < src.length; i++){
		if(src[i] == 0){
			zeroIndex = i;
			break;
		}
	}
	if(zeroIndex == -1)
		throw new Error("no 0s in the src array");

	//if it is IMPOSSIBLE to complete this task, this will run in an infinate loop
	while(! Arrays.equals(src,tgt)){
		int toSwap=-1;//needs to be initialized to something
		if(tgt[zeroIndex] == 0){//the 0 is in its final place, but not the rest of the array, so move the zero to someting that's out of place
			//find the first non-matching number in src
			for(int i =0; i < src.length; i++){
				if(src[i] != tgt[i])
					toSwap=i;
			}
		}
		else{
			int inTarget = tgt[zeroIndex];//the 0 isnt in its final place, so find out whats there in the tgt and then switch that number with 0
			//find this value in src and switch it with zero
			for(int i =0; i< src.length; i++){
				if(src[i] == inTarget)
					toSwap = i;
			}
		}
		//now do swap
		System.out.println("swapping 0 with " + String.valueOf(src[toSwap]));
		src[zeroIndex] = src[toSwap];
		src[toSwap] = 0;
		zeroIndex = toSwap;
	}
}

}