package task3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {

	private Triangle triangle;
	
	@DataProvider
	public Object [][] counterSquare_validDoubleDataProvider(){
		return new Object [][] {
			{1,1,0.5},
			{Double.MAX_VALUE,Double.MAX_VALUE,Double.POSITIVE_INFINITY}
		};
	}
	
	@DataProvider
	public Object [][] counterSquare_negativeDoubleDataProvider(){
		return new Object [][] {
			{Double.MAX_VALUE,2,Double.POSITIVE_INFINITY},
			{2,Double.MIN_VALUE,4.9E-324},
			{2,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
		};
	}
	
	@DataProvider
	public Object [][] counterPerimeter_validDoubleDataProvider(){
		return new Object [][] {
			{1,1,3.414213562373095},
			{Double.MAX_VALUE,Double.MAX_VALUE,Double.POSITIVE_INFINITY}
		};
	}
	
	@DataProvider
	public Object [][] counterPerimeter_negativeDoubleDataProvider(){
		return new Object [][] {
			{Double.MAX_VALUE,2,Double.POSITIVE_INFINITY},
			{2,Double.MIN_VALUE,4},
			{2,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
		};
	}
	
	@DataProvider
	public Object [][] lessThanZeroDoubleDataProvider(){
		return new Object [][] {
			{0,0},
			{-1,1},
			{1,-1},
			{Double.NaN,2},
			{Double.NEGATIVE_INFINITY,2},
		};
	}
	
	@DataProvider
	public Object [][] countPerimeter_validDoubleDataProvider(){
		return new Object [][] {
			{1,1,1},
			{0,0,0},
			{-1,-1,1},
			{-1,1,-1},
		};
	}
	
	@DataProvider
	public Object [][] countPerimeter_negativeDoubleDataProvider(){
		return new Object [][] {
			{Double.MAX_VALUE,2,Double.POSITIVE_INFINITY},
			{2,Double.MIN_VALUE,4.9E-324},
		};
	}
	
	@DataProvider
	public Object [][] countPerimeter_invalidDoubleDataProvider(){
		return new Object [][] {
			{Double.NaN,2,Double.NaN},
			{2,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
			{Double.NEGATIVE_INFINITY,2,Double.NEGATIVE_INFINITY},
		};
	}
	
	@DataProvider
	public Object [][] arePositiveArguments_positiveDoubleDataProvider(){
		return new Object [][] {
			{1,1},
			{Double.MIN_VALUE,1},
		};
	}
	
	@DataProvider
	public Object [][] arePositiveArguments_negetiveDoubleDataProvider(){
		return new Object [][] {
			{-1,1},
			{-1,-1},
		};
	}
	
	
	@Test (dataProvider="counterSquare_validDoubleDataProvider")
	public void countSquare_validDoubleData(double width, double length, double result){
		triangle = new Triangle(width, length);
		Assert.assertEquals(triangle.countSquare(), result);
	}
	
	@Test (dataProvider="counterSquare_negativeDoubleDataProvider")
	public void countSquare_negativeDoubleData(double width, double length, double result){
		triangle = new Triangle(width, length);
		Assert.assertEquals(triangle.countSquare(), result);
	}
	
	@Test (dataProvider="lessThanZeroDoubleDataProvider", expectedExceptions=IllegalArgumentException.class)
	public void countSquare_lessThanZeroDoubleData(double width, double length){
		triangle = new Triangle(width, length);
		triangle.countSquare();
	}
	
	@Test (dataProvider="counterPerimeter_validDoubleDataProvider")
	public void countPerimeter_validDoubleData(double width, double length, double result){
		triangle = new Triangle(width, length);
		Assert.assertEquals(triangle.countPerimeter(), result);
	}
	
	@Test (dataProvider="counterPerimeter_negativeDoubleDataProvider")
	public void countPerimeter_negativeDoubleData(double width, double length, double result){
		triangle = new Triangle(width, length);
		Assert.assertEquals(triangle.countPerimeter(), result);
	}
	
	@Test (dataProvider="lessThanZeroDoubleDataProvider", expectedExceptions=IllegalArgumentException.class)
	public void countPerimeter_lessThanZeroDoubleData(double width, double length){
		triangle = new Triangle(width, length);
		triangle.countPerimeter();
	}
	
	@Test (dataProvider="arePositiveArguments_positiveDoubleDataProvider")
	public void arePositiveArguments_positiveDoubleData(double width, double length){
		triangle = new Triangle(width, length);
		Assert.assertTrue(triangle.arePositiveArguments());
	}
	
	@Test (dataProvider="arePositiveArguments_negetiveDoubleDataProvider", expectedExceptions=IllegalArgumentException.class)
	public void arePositiveArguments_negetiveDoubleData(double width, double length){
		triangle = new Triangle(width, length);
		triangle.arePositiveArguments();
	}
}

