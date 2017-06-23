package task3;

import util.ArgConverter;
import util.ArgValidator;

public class Main {
	

	public static void main(String[] args) {
		
		
		double a;
		
		double b;
		
		
        ArgValidator arg_validator = new ArgValidator(args.length, 2);
		
		arg_validator.checkCorrectNumberOfArguments();
		
		
		
		ArgConverter arg_converter = new ArgConverter();
		
		a = arg_converter.convertToDouble(args[0]);
		
		b = arg_converter.convertToDouble(args[1]);
		

         
         Triangle triangle = new Triangle(a, b);
         
         double square = triangle.countSquare();
         
         double perimeter = triangle.countPerimeter();
         
         
         
         System.out.println("Square is " + square + ".");
         
         System.out.println("Perimeter is " + perimeter + ".");
		
	}

}
