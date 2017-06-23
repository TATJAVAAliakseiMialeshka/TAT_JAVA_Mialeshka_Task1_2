package task2;

import util.ArgConverter;
import util.ArgValidator;

public class Main {
	
  
	public static void main(String[] args) {
		
		 double a;
			
		 double b;
			
		 double c;
		
		
		ArgValidator arg_validator = new ArgValidator(args.length, 3);
		
		arg_validator.checkCorrectNumberOfArguments();
		
		
		
		ArgConverter arg_converter = new ArgConverter();
		
        a = arg_converter.convertToDouble(args[0]);
       
        b = arg_converter.convertToDouble(args[1]);
        
        c = arg_converter.convertToDouble(args[2]);
		
        
		 
		 Counter counter = new Counter(a, b, c);
		 
		 double result_of_calculation = counter.calculateByFormula();
		 
		
		 System.out.println(result_of_calculation);
		 
		 
	}

}
