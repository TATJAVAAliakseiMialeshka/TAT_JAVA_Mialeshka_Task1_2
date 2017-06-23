package task4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CoordinateTest {

	private Coordinate coordinate;
	private static final double MIN_DEFINE_DOUBLE = 0.1e-12;
	
	@DataProvider
	public Object [][] inRangeCoordsDataProvider(){
		return new Object [][] {
			{-2,4},
			{2,4},
			{-2,Double.MIN_VALUE},
			{2,Double.MIN_VALUE},
			{-4,0},
			{-4,-3},
			{4,0},
			{4,-3},
		};
	}
	
	@DataProvider
	public Object [][] outOfRangeCoordsDataProvider(){
		return new Object [][] {
			{-2,4 + MIN_DEFINE_DOUBLE},
			{-2 - MIN_DEFINE_DOUBLE, 4},
			{2 + MIN_DEFINE_DOUBLE, 4},
			{2, 4 + MIN_DEFINE_DOUBLE},
			{-2 - MIN_DEFINE_DOUBLE, MIN_DEFINE_DOUBLE},
			{2 + MIN_DEFINE_DOUBLE, MIN_DEFINE_DOUBLE},
			{-4, MIN_DEFINE_DOUBLE},
			{-4 - MIN_DEFINE_DOUBLE, 0},
			{-4, -3 - MIN_DEFINE_DOUBLE},
			{-4 - MIN_DEFINE_DOUBLE, -3},
			{4, MIN_DEFINE_DOUBLE},
			{4 + MIN_DEFINE_DOUBLE, 0},
			{4, -3 - MIN_DEFINE_DOUBLE},
			{4 + MIN_DEFINE_DOUBLE, -3},
		};
	}
	
	
	@Test (dataProvider="inRangeCoordsDataProvider")
	public void isInRange_inRangeCoords(double x, double y){
		coordinate = new Coordinate(x, y);
		Assert.assertTrue(coordinate.isInRange());
	}
	
	@Test (dataProvider="outOfRangeCoordsDataProvider")
	public void isInRange_outOfRangeCoords(double x, double y){
		coordinate = new Coordinate(x, y);
		Assert.assertFalse(coordinate.isInRange());
	}
}
