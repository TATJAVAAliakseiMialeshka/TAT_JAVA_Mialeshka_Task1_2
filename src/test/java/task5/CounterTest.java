package task5;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CounterTest {

	private Counter counter;
	
	@BeforeTest
	public void testSetUp(){
		counter = new Counter();
	}
	
	@DataProvider
	public Object [][] positiveDP(){
		return new Object [][] {
			{0,0},
			{1,1},
			{Double.MIN_VALUE, 0},
			{Double.MAX_VALUE, Double.POSITIVE_INFINITY},
			{Double.MIN_VALUE, 0},
		};
	}
	
	@DataProvider
	public Object [][] negativeDoubleDP(){
		return new Object [][] {
			{-1,1},
			{-Double.MIN_VALUE,0},
			{-Double.MAX_VALUE,Double.POSITIVE_INFINITY},
		};
	}
	
	@DataProvider
	public Object [][] invalidDoubleDataDP(){
		return new Object [][] {
			{Double.NaN,Double.NaN},
			{Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
			{Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY},
		};
	}
	
	@Test (dataProvider="positiveDP")
	public void changeNumber_positiveDouble(double number, double expected){
		Assert.assertEquals(counter.changeNumber(number), expected);
	}
	
	@Test (dataProvider="negativeDoubleDP")
	public void changeNumber_negativeDouble(double number, double expected){
		Assert.assertEquals(counter.changeNumber(number), expected);
	}
	
	@Test (dataProvider="invalidDoubleDataDP")
	public void changeNumber_invalidDoubleData(double number, double expected){
		Assert.assertEquals(counter.changeNumber(number), expected);
	}
}
