package util;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgConverterTest {

	private ArgConverter converter;
	
	@DataProvider
	public Object[][] validIntNumber() {
	return new Object[][] {
	{ "0" },
	{ "1" },
	{ "-1"},
	{ String.valueOf(Integer.MIN_VALUE)},
	{ String.valueOf(Integer.MAX_VALUE)},
	};
	}
	
	@DataProvider
	public Object[][] nullString() {
	return new Object[][] {
	{ null }
	};
	}
	
	@DataProvider
	public Object[][] emptyString() {
	return new Object[][] {
	{ "" }
	};
	}
	
	@DataProvider
	public Object[][] notIntData() {
	return new Object[][] {
	{ "0.0" },
	{ "0d" },
	{ "0f" },
	{ "0L" },
	{ "string" },
	{ "true" }
	};
	}
	
	@DataProvider
	public Object[][] validDoubleData() {
	return new Object[][] {
	{ "0.0" },
	{ "0d" },
	{ "0f" },
	{ String.valueOf(Double.MIN_VALUE)},
	{ String.valueOf(Double.MAX_VALUE)},
	};
	}
	
	@DataProvider
	public Object[][] invalidDoubleData() {
	return new Object[][] {
		{ String.valueOf(Double.POSITIVE_INFINITY)},
		{ String.valueOf(Double.NEGATIVE_INFINITY)},
		{ String.valueOf(Double.NaN)},
	};
	}
	
	
	@BeforeTest
	public void testSetUp(){
		converter = new ArgConverter(); 
	}
	
	@Test(dataProvider = "validIntNumber")
	public void convertToInteger_validInt(String validIntNumber){
		converter.convertToInteger(validIntNumber);
	}
	
	@Test(dataProvider = "notIntData", expectedExceptions=InvalidArgException.class)
	public void convertToInteger_notIntData(String notIntData){
		converter.convertToInteger(notIntData);
	}
	
	@Test(dataProvider = "nullString", expectedExceptions = InvalidArgException.class)
	public void convertToInteger_nullString(String nullString){
		converter.convertToInteger(nullString);
	}
	
	@Test(dataProvider = "emptyString", expectedExceptions=InvalidArgException.class)
	public void convertToInteger_emptyString(String emptyString){
		converter.convertToInteger(emptyString);
	}
	
	@Test(dataProvider = "validDoubleData")
	public void convertToDouble_validInt(String validIntNumber){
		converter.convertToDouble(validIntNumber);
	}
	
	@Test(dataProvider = "invalidDoubleData")
	public void convertToDouble_notIntData(String notIntData){
		converter.convertToDouble(notIntData);
	}
	
	@Test(dataProvider = "nullString", expectedExceptions = InvalidArgException.class)
	public void convertToDouble_nullString(String nullString){
		converter.convertToDouble(nullString);
	}
	
	@Test(dataProvider = "emptyString", expectedExceptions=InvalidArgException.class)
	public void convertToDouble_emptyString(String emptyString){
		converter.convertToDouble(emptyString);
	}
}
