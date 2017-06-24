package task6;

import org.testng.Assert;
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
	public Object [][] countMax_aMoreThanBAndMoreThanC_DP(){
		return new Object [][] {
			{1,0,-1, 1},
		};
	}
	
	@DataProvider
	public Object [][] countMax_bMoreThanAAndMoreThanC_DP(){
		return new Object [][] {
			{-1,1,0, 1},
		};
	}
	
	@DataProvider
	public Object [][] countMax_cMoreThanAAndMoreThanC_DP(){
		return new Object [][] {
			{0,-1,1, 1},
		};
	}
	
	@DataProvider
	public Object [][] countMax_aEqualsBAndBothMoreThanC_DP(){
		return new Object [][] {
			{0,0,-1, 0},
			{1,1,0, 1},
			{-1,-1,-2, -1},
		};
	}
	
	@DataProvider
	public Object [][] countMax_aEqualsCAndBothMoreThanB_DP(){
		return new Object [][] {
			{0,-1,0, 0},
			{1,-1,1, 1},
			{-1,-2,-1, -1},
			{1,0,1, 1},
		};
	}
	
	@DataProvider
	public Object [][] countMax_bEqualsCAndBothMoreThanA_DP(){
		return new Object [][] {
			{-2,-1,-1, -1},
			{0,1,1, 1},
			{1,2,2, 2},
			{-1,0,0, 0},
		};
	}
	
	

	@DataProvider
	public Object [][] countMin_aLessThanBAndC_DP(){
		return new Object [][] {
			{-1,0,1, -1},
		};
	}
	
	@DataProvider
	public Object [][] countMin_bLessThanAAndC_DP(){
		return new Object [][] {
			{0,-1,0, -1},
		};
	}
	
	@DataProvider
	public Object [][] countMin_cLessThanAAndB_DP(){
		return new Object [][] {
			{0,1,-1, -1},
		};
	}
	
	@DataProvider
	public Object [][] countMin_aEqualsBAndBothLessThanC_DP(){
		return new Object [][] {
			{-1,-1,0, -1},
			{0,0,1, 0},
			{-2,-2,-1, -2},
		};
	}
	
	@DataProvider
	public Object [][] countMin_aEqualsCAndBothLessThanB_DP(){
		return new Object [][] {
			{-1,0,-1, -1},
			{-1,1,-1, -1},
			{-2,-1,-2, -2},
			{0,1,0, 0},
		};
	}
	
	@DataProvider
	public Object [][] countMin_bEqualsCAndBothLessThanA_DP(){
		return new Object [][] {
			{-1,-2,-2, -2},
			{1,0,0, 0},
			{2,1,1, 1},
			{0,-1,-1, -1},
		};
	}
	
	@DataProvider
	public Object [][] sumMinMax_validDoubleData_DP(){
		return new Object [][] {
			{1,1, 2},
			{-1,1, 0},
			{-1,-1, -2},
			{0,0, 0},
			{Double.MIN_VALUE,Double.MIN_VALUE, 1.0E-323},
			{Double.MIN_VALUE,-Double.MIN_VALUE, 0},
			{Double.MAX_VALUE,Double.MAX_VALUE, Double.POSITIVE_INFINITY},
			{-Double.MAX_VALUE,Double.MAX_VALUE, 0},
		};
	}
	
	@DataProvider
	public Object [][] sumMinMax_invalidDoubleData_DP(){
		return new Object [][] {
			{Double.NaN,1, Double.NaN},
			{-1,Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
			{0,Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
			{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN},
		};
	}
	
	@Test (dataProvider="countMax_aMoreThanBAndMoreThanC_DP")
	public void countMax_aMoreThanBAndMoreThanC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}
	
	@Test (dataProvider="countMax_bMoreThanAAndMoreThanC_DP")
	public void countMax_bMoreThanAAndMoreThanC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}
	
	@Test (dataProvider="countMax_cMoreThanAAndMoreThanC_DP")
	public void countMax_cMoreThanAAndMoreThanC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}
	
	@Test (dataProvider="countMax_aEqualsBAndBothMoreThanC_DP")
	public void countMax_aEqualsBAndBothMoreThanC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}
	
	@Test (dataProvider="countMax_aEqualsCAndBothMoreThanB_DP")
	public void countMax_aEqualsCAndBothMoreThanB(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}
	
	@Test (dataProvider="countMax_bEqualsCAndBothMoreThanA_DP")
	public void countMax_bEqualsCAndBothMoreThanA(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMax(), expected);
	}

	
	
	@Test (dataProvider="countMin_aLessThanBAndC_DP")
	public void countMin_aLessThanBAndC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	@Test (dataProvider="countMin_bLessThanAAndC_DP")
	public void countMin_bLessThanAAndC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	@Test (dataProvider="countMin_cLessThanAAndB_DP")
	public void countMin_cLessThanAAndB(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	@Test (dataProvider="countMin_aEqualsBAndBothLessThanC_DP")
	public void countMin_aEqualsBAndBothLessThanC(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	@Test (dataProvider="countMin_aEqualsCAndBothLessThanB_DP")
	public void countMin_aEqualsCAndBothLessThanB(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	@Test (dataProvider="countMin_bEqualsCAndBothLessThanA_DP")
	public void countMin_bEqualsCAndBothLessThanA(double a, double b, double c, double expected){
		counter = new Counter(a, b, c);
		Assert.assertEquals(counter.countMin(), expected);
	}
	
	
	
	@Test (dataProvider="sumMinMax_validDoubleData_DP")
	public void sumMinMax_validDoubleData(double minValue, double maxValue, double expected){
		Assert.assertEquals(counter.sumMinMax(minValue, maxValue), expected);
	}
	
	@Test (dataProvider="sumMinMax_invalidDoubleData_DP")
	public void sumMinMax_invalidDoubleData(double minValue, double maxValue, double expected){
		Assert.assertEquals(counter.sumMinMax(minValue, maxValue), expected);
	}
	
}
