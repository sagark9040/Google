package ctci.recursionAndDP;

import java.util.ArrayList;

public class Q99NQueens {
	static int GRID_SIZE = 5;

	static ArrayList<Integer[]> placeQueens(int row, Integer[] columns,

	ArrayList<Integer[]> results) {
		if (row == GRID_SIZE) { // Found valid placement
			results.add(columns.clone());
		} else {
			for (int col = 0; col < GRID_SIZE; col++) {
				if (checkValid(columns, row, col)) {
					columns[row] = col; // Placequeen 
					placeQueens(row + 1, columns, results);
				}
			}
		}
		
		return results;
	}

	/*
	 * Check if (rowl, columnl) is a valid spot for a queen by checking
	 * *ifthereisaqueeninthesamecolumnordiagonal.Wedon't
	 * *needtocheckitforqueensinthesamerowbecausethecalling
	 * *placeQueenonlyattemptstoplaceonequeenatatime.Weknow *thisrowisempty.
	 */
	static boolean checkValid(Integer[] columns, int rowl, int columnl) {
		for (int row2 = 0; row2 < rowl; row2++) {
			int column2 = columns[row2];
			/*
			 * Check if (row2, column2) invalidates (rowl, columnl) as a queen
			 * spot.
			 */
			/* Check if rows have a queen in the same column */ if (columnl == column2) {
				return false;
			}
			/*
			 * Check diagonals: if the distance between the columns equals the
			 * distance between the rows, then they're in the * same diagonal.
			 */
			int columnDistance = Math.abs(column2 - columnl);
			/* rowl > row2, so no need for abs */ int rowDistance = rowl - row2;
			if (columnDistance == rowDistance) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args[]) {
		Integer[] columns = new Integer[5];
		ArrayList<Integer[]> results = new ArrayList<Integer[]>();
		
		results = placeQueens(0, columns, results);
		for (Integer[] i : results) {			
			StringBuilder builder = new StringBuilder();
			for (int a : i) {
			  builder.append(a);
			}
			String text = builder.toString();
			System.out.println(text);
		}
	}
}
