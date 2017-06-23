package task5;

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
			
			
			
		Counter counter = new Counter();	
			
		double first_number_changed = counter.changeNumber(first_number);
		
		double second_number_changed = counter.changeNumber(second_number);
		
		double third_number_changed = counter.changeNumber(third_number);
		
		
		System.out.println("First number is " + first_number_changed + ".\n" + 
		                   "Second number is " + second_number_changed + ".\n" + 
				           "Third number is " + third_number_changed + ".");
		
	}
	
}
