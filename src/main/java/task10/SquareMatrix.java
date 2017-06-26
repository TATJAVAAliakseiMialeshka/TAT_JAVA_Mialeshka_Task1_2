package task10;

public class SquareMatrix {
	
	int n;
	
	int matrix[][];
	
	
	public SquareMatrix(int n) {
		
		this.n = n;
	
	}
	
	
	public int[][] generateSquareMatrix() {
		
		if (n > 0) {
			matrix = new int[n][n];

			for (int i = 0; i < matrix.length; i++) {
				
				for (int j = 0; j < matrix[i].length; j++) {
					
					if (i % 2 == 0) {
						
						matrix[i][j] = j + 1;
						
					} else {
						
						matrix[i][j] = n - j;
						
					}
					
				}
				
			}
			
		}
		return matrix;
		
	}
	
	
	public void printMatrix(int[][] matrix) {
		
		if (n != 0) {
			for (int i = 0; i < matrix.length; i++) {
				
				for (int j = 0; j < matrix[i].length; j++) {
					
					System.out.print(matrix[i][j] + " ");
					
				}
				
			 System.out.println("");
			 
			}
		}
	}

}
