package task4;

import util.ArgConverter;
import util.ArgValidator;

public class Main {
	
	public static void main(String[] args) {
		
		double x;
		
		double y;
		
		
		 ArgValidator arg_validator = new ArgValidator(args.length, 2);
			
		 arg_validator.checkCorrectNumberOfArguments();
			
			
			
			ArgConverter arg_converter = new ArgConverter();
			
			x = arg_converter.convertToDouble(args[0]);
			
			y = arg_converter.convertToDouble(args[1]);
			
	   
	    
	     Coordinate coordinate = new Coordinate(x, y);
	     
	     boolean result = coordinate.isInRange();
	     
	     
	     if (result) {
	    	 
	    	 System.out.println("true");
	    	 
	     }
	     
	     else {
	    	 
	    	 System.out.println("false");
	    	 
	     }
		
		
	}

}
