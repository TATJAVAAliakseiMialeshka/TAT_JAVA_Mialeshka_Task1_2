package task2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CounterTest {

	private Counter counter;
	
	@DataProvider
	public Object [][] calculateByFormula_validDoubleDataProvider(){
		return new Object [][] {
			{1,1,1, 1.618033988749895},
			{-1,1,0, 0.0},
			{1,1,Double.NaN, Double.NaN},
			{1,Double.NaN,1, Double.NaN},
			{Double.NaN,1,1 ,Double.NaN},
			{1,1,Double.POSITIVE_INFINITY,Double.NaN},
			{1,Double.POSITIVE_INFINITY,1,Double.POSITIVE_INFINITY},
			{Double.POSITIVE_INFINITY,1,1,Double.NaN},
			{1,Double.NEGATIVE_INFINITY,1,Double.NaN},
		};
	}
	
	@DataProvider
	public Object [][] calculateByFormula_invalidDoubleDataProvider(){
		return new Object [][] {
			{1,0,-1,Double.NaN},
			{0,1,-1,Double.POSITIVE_INFINITY},
			{1,1,Double.NEGATIVE_INFINITY,Double.NaN},
			{Double.NEGATIVE_INFINITY,1,1,Double.NaN},
		};
	}
	
	@DataProvider
	public Object [][] calculateByFormula_dividedByZeroDataProvider(){
		return new Object [][] {
			{0,1,1,Double.POSITIVE_INFINITY},
		};
	}
	
	@Test (dataProvider="calculateByFormula_validDoubleDataProvider")
	public void calculateByFormula_validData(double a, double b, double c, double expected){
		counter = new Counter(a,b,c);
		Assert.assertEquals(counter.calculateByFormula(),expected);
	}
	
	@Test (dataProvider="calculateByFormula_invalidDoubleDataProvider", expectedExceptions=IllegalArgumentException.class)
	public void calculateByFormula_invalidData(double a, double b, double c, double expected){
		counter = new Counter(a,b,c);
		Assert.assertEquals(counter.calculateByFormula(),expected);
	}
	
	@Test (dataProvider="calculateByFormula_dividedByZeroDataProvider", expectedExceptions=IllegalArgumentException.class)
	public void calculateByFormula_dividedByZero(double a, double b, double c, double expected){
		counter = new Counter(a,b,c);
		Assert.assertEquals(counter.calculateByFormula(),expected);
	}
}
