package task10;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareMatrixTest {

	private SquareMatrix squareMatrix;
	
	@DataProvider
	public Object [][] validInt_DP(){
		return new Object [][] {
			{1, new int [][]{ {1} }},
			{2, new int [][]{ {1,2}, {2,1} }}
		};
	}
	@DataProvider
	public Object [][] invalidInt_DP(){
		return new Object [][] {
			{0, null},
			{-1, null},
		};
	}
	
	
	@Test(dataProvider = "validInt_DP")
	public void generateSquareMatrix_validInt(int n, int[][] expected) {
		squareMatrix = new SquareMatrix(n);
		compareArrays(squareMatrix.generateSquareMatrix(), expected);
		Assert.assertTrue(compareArrays(squareMatrix.generateSquareMatrix(), expected));
	}

	@Test(dataProvider = "validInt_DP")
	public void generateSquareMatrix_invalidInt(int n, int[][] expected) {
		squareMatrix = new SquareMatrix(n);
		compareArrays(squareMatrix.generateSquareMatrix(), expected);
		Assert.assertTrue(compareArrays(squareMatrix.generateSquareMatrix(), expected));
	}

	private boolean compareArrays(int[][] first, int[][] second) {

		if (first.length != second.length) {
			return false;
		}
		for (int i = 0; i < first.length; i++) {
			if (first[i].length != second[i].length) {
				return false;
			}
			for (int j = i; j < first[j].length - 1; j++) {
				if (first[i][j] != second[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
}
