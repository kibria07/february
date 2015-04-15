package dimentionalArray;

public class Test2DimentionArray {

	
	public static void main(String[] args) {
		
		int[][] M2Darray={
				
				{1,3,4,5},
				{5,4,34,54},
				{5,89,54,34}
		};
		
		int numRows = M2Darray.length;
		int numCol=0;
		//iterate row
		for (int i=0; i < numRows;i++){
			numCol=M2Darray[i].length;
			
			// iterate column
			for(int j=0; j<numCol;j++){
				System.out.print(M2Darray[i][j]+ "\t");
			}
			System.out.println();
				
			}
		System.out.println("numofRows = " + numRows);
		System.out.println("numofColumn ="+ numCol);
		}	
		
		

	}


