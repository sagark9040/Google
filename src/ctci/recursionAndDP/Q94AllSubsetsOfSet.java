package ctci.recursionAndDP;
import java.util.ArrayList;
	
public class Q94AllSubsetsOfSet {

	 
	
	    // Print all subsets of given set[]
	    static void printSubsets(char set[])
	    {
	        int n = set.length;
	 
	        // Run a loop for printing all 2^n
	        // subsets one by obe
	        for (int i = 0; i < (1<<n); i++)
	        {
	            System.out.print("i="+Integer.toBinaryString(i) +"{ ");
	 
	            // Print current subset
	            for (int j = 0; j < n; j++) {
	 
	                // (1<<j) is a number with jth bit 1
	                // so when we 'and' them with the
	                // subset number we get which numbers
	                // are present in the subset and which
	                // are not
	            	
	            	System.out.print("i="+Integer.toBinaryString(i)+"  (1 << "+j+")=" +  (1 << j) + " ... ");
	                if ((i & (1 << j)) > 0)
	                    System.out.print(set[j] + ".");
	            }
	            
	            System.out.println("}");
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        char set[] = {'a', 'b', 'c'};
	        //printSubsets(set);
	        //printSubsetsCareerCup();
	        
	        int[] input = {1,2,3};
	        selfPowerSet(input);
	    }
	    
	    private static void selfPowerSet(int[] input) {
	    	ArrayList<ArrayList<Integer>> powerSet = new ArrayList<ArrayList<Integer>>();
	    	powerSet.add(new ArrayList<Integer>()); //add empty set to the power list
	    	
	    	for(int i=0;i<input.length;i++){
	    		ArrayList<ArrayList<Integer>> subSets = new ArrayList<ArrayList<Integer>>();
	    		
	    		for (int j=0;j<powerSet.size();j++) {
	    			
	    			ArrayList<Integer> tmp = new ArrayList<Integer>();
	    			tmp.addAll(powerSet.get(j));
	    			tmp.add(input[i]);
	    			subSets.add(new ArrayList<Integer>(tmp));
	    		}
	    		
	    		powerSet.addAll(subSets);
	    		
	    	}
	    	System.out.println(powerSet);
	    	
		}

		static void printSubsetsCareerCup () {

	    	int [] source = {1,2,3,4}; 
	    	int currentSubset = 15; 
	    	int tmp; 
	    	while(currentSubset>=0) 
	    	{ 
	    		System.out.print("("); 
	    		tmp = currentSubset; 
	    		String bin = Integer.toString(tmp,2);
	    		for(int i = 0; i<4; i++) 
	    		{ 
	    			int k = tmp&1;
	    			if (k==1) 
	    				System.out.print(source[i]); 
	    			tmp >>= 1; 
	    		} 
	    		
	    		System.out.println(")"); 
	    		
	    		currentSubset--; 
	    	} 
	    }


	    
	}
	

