package task1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.InvalidArgException;

public class CounterTest {

	private Counter counter;
	
	@DataProvider
	public Object[][] sumFirstTwoNumbers_validIntData() {
	return new Object[][] {
	{ 1000, 1},
	{ 9999, 18},
	{ 4999, 13},
	{ -4999, 5},
	};
	}
	
	@DataProvider
	public Object[][] sumSecondTwoNumbers_validIntData() {
	return new Object[][] {
	{ 1000, 0},
	{ 9999, 18},
	{ 4999, 18},
	{ -4999, 18},
	};
	}
	
	@DataProvider
	public Object[][] sumTwoNumbers_invalidIntData() {
	return new Object[][] {
	{ Integer.MAX_VALUE},
	{ Integer.MIN_VALUE},
	{ 999},
	{ 10000},
	{ -999},
	{ -10000},
	{ 0000},
	};
	}
	
	
	@DataProvider
	public Object[][] zeroIntData() {
	return new Object[][] {
	{ 0, 0},
	};
	}
	
	@DataProvider
	public Object[][] secondTwoNumbersIntData() {
	return new Object[][] {
	{ 1234, 7},
	{ -1234, 7},
	{ 12, 3},
	{ -12, 1},
	{ Integer.MAX_VALUE, 11 },
	{ Integer.MIN_VALUE, 12 },
	};
	}
	
	@DataProvider
	public Object[][] isFourDigit_correctIntData() {
	return new Object[][] {
	{ 1000 },
	{ 1234 },
	{ 9999 },
	};
	}
	
	@DataProvider
	public Object[][] isFourDigit_incorrectIntData() {
	return new Object[][] {
		{ 999 },
		{ 10000 },
	};
	}
	
	@DataProvider
	public Object[][] compareSums_equalSum() {
	return new Object[][] {
		{ 10,10 },
		{ 99,99 },
		{ 49,49 },
	};
	}
	
	@DataProvider
	public Object[][] compareSums_notEqualSum() {
	return new Object[][] {
		{ 10,11 },
		{ 99,1 },
		{ 49,5 },
		{ -10,11 },
		{ 99,-1 },
		{ -49,5 }
	};
	}
	
	@DataProvider
	public Object[][] compareSums_notTwoDigitNumber() {
	return new Object[][] {
		{ 00,00 },
		{ 9,9 },
		{ 100,100 },
	};
	}
	
	@DataProvider
	public Object[][] twoDigitNumber() {
	return new Object[][] {
		{ 10 },
		{ 99 },
		{ 51 },
		{ -51 }
	};
	}
	
	@DataProvider
	public Object[][] notTwoDigitNumber() {
	return new Object[][] {
		{ 100 },
		{ 9 },
	};
	}
	
	@DataProvider
	public Object[][] fourDigitNumber() {
	return new Object[][] {
		{ 1000},
		{ 9999 },
		{ 4999},
		{ -4999},
	};
	}
	
	@DataProvider
	public Object[][] notFourDigitNumber() {
	return new Object[][] {
		{ 999},
		{ 10000 },
	};
	}
	
	@BeforeTest
	public void testSetUp(){
		counter = new Counter();
	}
	
	@Test (dataProvider="sumFirstTwoNumbers_validIntData")
	public void sumFirstTwoNumbers_validIntData(int actual, int expected){
		Assert.assertEquals(counter.sumFirstTwoNumbers(actual), expected);
	}
	
	@Test (dataProvider="sumTwoNumbers_invalidIntData", expectedExceptions=InvalidArgException.class)
	public void sumFirstTwoNumbers_invalidIntData(int actual){
		counter.sumFirstTwoNumbers(actual);
	}
	
	@Test (dataProvider="sumSecondTwoNumbers_validIntData")
	public void sumSecondTwoNumbers_validIntData(int actual, int expected){
		Assert.assertEquals(counter.sumSecondTwoNumbers(actual), expected);
	}
	
	@Test (dataProvider="sumTwoNumbers_invalidIntData", expectedExceptions=InvalidArgException.class)
	public void sumSecondTwoNumbers_invalidIntData(int actual){
		counter.sumSecondTwoNumbers(actual);
	}
	
	@Test (dataProvider="fourDigitNumber")
	public void isFourDigit_fourDigitNumber(int actual){
		Assert.assertTrue(counter.isFourDigit(actual));
	}
	@Test (dataProvider="notFourDigitNumber", expectedExceptions=InvalidArgException.class)
	public void isFourDigit_notFourDigitNumber(int actual){
		counter.isFourDigit(actual);
	}
	
	@Test (dataProvider="twoDigitNumber")
	public void isTwoDigit_fourDigitNumber(int actual){
		Assert.assertTrue(counter.isTwoDigit(actual));
	}
	@Test (dataProvider="notTwoDigitNumber", expectedExceptions=InvalidArgException.class)
	public void isTwoDigit_notTwoDigitNumber(int actual){
		counter.isTwoDigit(actual);
	}

	@Test (dataProvider="compareSums_equalSum")
	public void compareSums_equalSum(int firstSum, int secondSum){
		Assert.assertTrue(counter.compareSums(firstSum, secondSum));
	}
	@Test (dataProvider="compareSums_notEqualSum")
	public void compareSums_notEqualSum(int firstSum, int secondSum){
		Assert.assertFalse(counter.compareSums(firstSum, secondSum));
	}
	@Test (dataProvider="compareSums_notTwoDigitNumber", expectedExceptions=InvalidArgException.class)
	public void compareSums_notTwoDigitNumber(int firstSum, int secondSum){
		Assert.assertFalse(counter.compareSums(firstSum, secondSum));
	}
}
