package task8;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.InvalidArgException;

public class CounterTest {

	private Counter counter;
	
	@BeforeTest
	public void testSetUp(){
		counter = new Counter();
	}
	
	@DataProvider
	public Object [][] extractA_arrLengthMoreThan0_DP(){
		return new Object [][] {
			{new int [] {1}, 1},
		};
	}

	
	@DataProvider
	public Object [][] extractArrayOfNaturalNumbers_arrLengthMoreThan0_DP(){
		return new Object [][] {
			{new int [] {1,1}, new int [] {1}},
			{new int [] {-1,1}, new int [] {1}}
		};
	}
	
	@DataProvider
	public Object [][] extractArrayOfNaturalNumbers_arrWithNegativeValues_DP(){
		return new Object [][] {
			{new int [] {1,-1}},
			{new int [] {-1,-1}},
			{new int [] {1,0}},
		};
	}
	
	@DataProvider
	public Object [][] countSum_validData_DP(){
		return new Object [][] {
			{new int [] {8,2,-14,1,3}, 2, -4},
			{new int [] {8,2,-14,1,3}, -2, -4},
			{new int [] {8,2,-14,0,3}, 1, -1},
			{new int [] {8,Integer.MAX_VALUE-1,-14,0,3}, 2, 2147483640},
		};
	}
	
	@DataProvider
	public Object [][] countSum_kEquals0_DP(){
		return new Object [][] {
			{new int [] {8,2,-14,1,3}, 0, -4},
		};
	}
	
	@DataProvider
	public Object [][] countSum_emptyArr_DP(){
		return new Object [][] {
			{new int [] {}, 1, 0},
		};
	}
	
	@DataProvider
	public Object [][] countSum_nullArr_DP(){
		return new Object [][] {
			{null, 1},
		};
	}
	
	
	@Test (dataProvider="extractA_arrLengthMoreThan0_DP")
	public void extractA_arrLengthMoreThan0(int[] array, int expected){
		Assert.assertEquals(counter.extractA(array), expected);
	}
	
	@Test (expectedExceptions=InvalidArgException.class)
	public void extractA_arrLength0(){
		counter.extractA(new int [] {});
	}
	
	@Test
	public void extractA_nullArr(){
		counter.extractA(null);
	}

	
	@Test (dataProvider="extractArrayOfNaturalNumbers_arrLengthMoreThan0_DP")
	public void extractArrayOfNaturalNumbers_arrLengthMoreThan0(int[] array, int [] expected){
		Assert.assertEquals(counter.extractArrayOfNaturalNumbers(array), expected);
	}
	
	@Test (dataProvider="extractArrayOfNaturalNumbers_arrWithNegativeValues_DP", expectedExceptions=InvalidArgException.class)
	public void extractArrayOfNaturalNumbers_arrWithNegativeValues(int[] array){
		counter.extractArrayOfNaturalNumbers(array);
	}
	
	@Test
	public void extractArrayOfNaturalNumbers_nullArr(){
		counter.extractArrayOfNaturalNumbers(null);
	}
	
	@Test
	public void extractArrayOfNaturalNumbers_emptyArr(){
		counter.extractArrayOfNaturalNumbers(new int [] {});
	}
	
	
	@Test (dataProvider="countSum_validData_DP")
	public void countSum_validData(int[] array, int k, int expected){
		Assert.assertEquals(counter.countSum(array, k), expected);
	}
	
	@Test (dataProvider="countSum_kEquals0_DP")
	public void countSum_kEquals0(int[] array, int k, int expected){
		Assert.assertEquals(counter.countSum(array, k), expected);
	}
	
	@Test (dataProvider="countSum_emptyArr_DP")
	public void countSum_emptyArr(int[] array, int k, int expected){
		Assert.assertEquals(counter.countSum(array, k), expected);
	}
	
	@Test (dataProvider="countSum_nullArr_DP")
	public void countSum_nullArr(int[] array, int k){
		counter.countSum(array, k);
	}
	
	
	
}
