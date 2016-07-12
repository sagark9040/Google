package misc;

public class BMBitShiftTest {

	public static void main (String args[]) {
		//bitShift();
		Shift1();
		
		
		
		
	}
	
	static void bitShift(){
		for (int i=1;i<40;i++) {
			int val = (1<<i);
			System.out.println("i="+i+" val=" + val + " " + Integer.toString(val,2));
		}
	}
	
	static void Shift1(){
			int decimal = 8;
			int val = (~0)<<2;
			
			System.out.println("val=" + val + " " + Integer.toBinaryString(val));
			System.out.println(decimal + " & " + Integer.toBinaryString(val) + " = " + (decimal & val));
			System.out.println("8<<5:" + Integer.toBinaryString(((8)<<5)));
		
	}
	
	//Insert B into A at position i-->j
	//A = 101010
	//B = 11
	//i=3,j=4
	//Result = 10111010 
}
