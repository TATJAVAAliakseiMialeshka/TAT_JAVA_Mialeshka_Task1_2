package task5;

public class Counter {
	
	public double changeNumber(double number) {
		
		double result;
		
		if (number < 0) {
			
			result = Math.pow(number, 4);
			
			return result;
			
		}
		
		else {
			
			result =  Math.pow(number, 2);
			
			return result;
			
		}
		
	}
	

}
