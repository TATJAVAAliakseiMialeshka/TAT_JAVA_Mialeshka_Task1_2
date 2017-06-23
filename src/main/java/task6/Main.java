package task6;

import util.ArgConverter;
import util.ArgValidator;

public class Main {
	
   public static void main(String[] args) {
		
        double first_number;
		
		double second_number;
		
		double third_number;
		
		
		 ArgValidator arg_validator = new ArgValidator(args.length, 3);
			
		 arg_validator.checkCorrectNumberOfArguments();
			
			
			
			ArgConverter arg_converter = new ArgConverter();
			
			
			first_number = arg_converter.convertToDouble(args[0]);
			
			second_number = arg_converter.convertToDouble(args[1]);
			
			third_number = arg_converter.convertToDouble(args[2]);
			
			
			
		Counter counter = new Counter(first_number, second_number, third_number);
		
		
        double minValue = counter.countMin();
    	
    	double maxValue = counter.countMax();
    	
    	
    	double sum = counter.sumMinMax(minValue, maxValue);
    	
    	
    	System.out.println("Sum is " + sum + ".");
		
   }	

}
