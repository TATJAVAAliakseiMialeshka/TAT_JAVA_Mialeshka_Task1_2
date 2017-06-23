package task3;

import util.InvalidArgException;

public class Triangle {
	
	
	public double a;
	
	public double b;
	
	
    public Triangle(double a, double b) {
		
		this.a = a;
		
		this.b = b;
		
	}
	
	
	
	public boolean arePositiveArguments() {
		
		if (a > 0 && b > 0) {
			
			return true;
			
		}
		
		else {
			
			throw new InvalidArgException
			 ("You have entered incorrect data: arguments can not be negavive"
				 		+ " or be equal to zero.");
		
		}
		
	}	
	
	
	
	public double countSquare() {
		
		if (this.arePositiveArguments()) {
		
		double square = a*b/2;
		
		return square;
		
		}
		
		else {
			
			throw new InvalidArgException
			 ("You have entered incorrect data: arguments can not be negavive"
				 		+ " or be equal to zero.");
			
		}
		
	}
	
	
	public double countPerimeter() {
		
		if (this.arePositiveArguments()) {
		
        double perimeter = a + b + Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		
		return perimeter;
		
		}
		
		else {
			
			throw new InvalidArgException
			 ("You have entered incorrect data: arguments can not be negavive"
				 		+ " or be equal to zero.");
			
		}
		
	}

}
