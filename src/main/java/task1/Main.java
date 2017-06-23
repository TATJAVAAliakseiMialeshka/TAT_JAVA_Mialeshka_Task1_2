package task1;

import util.ArgConverter;
import util.ArgValidator;


public class Main {
	
	public static void main(String[] args) {
		
		
		int number;
		
	
		ArgValidator arg_validator = new ArgValidator(args.length, 1);
		
		arg_validator.checkCorrectNumberOfArguments();
		
		
		
		ArgConverter arg_converter = new ArgConverter();
			 
		number = arg_converter.convertToInteger(args[0]);
		
		
		
		Counter counter = new Counter();
				
		int first_sum = counter.sumFirstTwoNumbers(number);
	
		int second_sum = counter.sumSecondTwoNumbers(number);
		
				
		boolean result_of_comparison = counter.compareSums(first_sum, second_sum);
		
		
		
		if (result_of_comparison) {
			
			System.out.println("true");
			
		}
		
		else  {
			
			System.out.println("false");
			
		}

		
	}

}
