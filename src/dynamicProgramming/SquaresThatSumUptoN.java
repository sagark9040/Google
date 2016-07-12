package dynamicProgramming;

public class SquaresThatSumUptoN {

	static int num_squares(int number){
	    int[] tableOfMinsTillNumber = new int[number+1];
	    int maxSqRt = (int)(Math.sqrt(number));
	    int iSquared;

	    for (int i=0; i<=number; i++){
	        tableOfMinsTillNumber[i] = i;
	    }
	    for (int countTillSqrtOfNum=2; countTillSqrtOfNum<=maxSqRt; countTillSqrtOfNum++){
	        for (int numIncrementor=0; numIncrementor<=number; numIncrementor++){
	            iSquared = countTillSqrtOfNum*countTillSqrtOfNum;
	            if (iSquared <= numIncrementor)
	                tableOfMinsTillNumber[numIncrementor] = Math.min(tableOfMinsTillNumber[numIncrementor], tableOfMinsTillNumber[numIncrementor-iSquared]+1);
	        }
	    }
	    for(int i=0;i<tableOfMinsTillNumber.length;i++)
	    	System.out.print(i + ":" + tableOfMinsTillNumber[i] + "  ");
	    return tableOfMinsTillNumber[number];
	}
	
	public static void main (String args[]) {
		System.out.println("\n" + num_squares(12));
	}
}
