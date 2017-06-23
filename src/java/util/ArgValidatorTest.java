package util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgValidatorTest {
	
	private ArgValidator validator;
	
	@DataProvider
	public Object[][] equalArguments() {
	return new Object[][] {
		{ 1,1 },
		{ 0,0 },
		{ -1,-1},
	};
	}
	
	@DataProvider
	public Object[][] notEqualArguments() {
	return new Object[][] {
		{ 1,-1},
		{ 0,1 },
		{ 1,-1},
	};
	}
	
	@Test(dataProvider = "equalArguments")
	public void convertToInteger_equalArguments(int actual, int expected){
		validator = new ArgValidator(actual, expected);
		Assert.assertTrue(validator.checkCorrectNumberOfArguments());
	}
	
	@Test(dataProvider = "notEqualArguments", expectedExceptions=InvalidArgException.class)
	public void convertToInteger_notEqualArguments(int actual, int expected){
		validator = new ArgValidator(actual, expected);
		validator.checkCorrectNumberOfArguments();
	}
	
}
