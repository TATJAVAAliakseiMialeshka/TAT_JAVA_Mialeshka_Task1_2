package task10;

import util.ArgConverter;
import util.ArgValidator;

public class Main {
	
   public static void main(String[] args) {
		
		int n;
		
		int matrix[][];
		
		
        ArgValidator arg_validator = new ArgValidator(args.length, 1);
		
		arg_validator.checkCorrectNumberOfArguments();
		
		
		
		ArgConverter arg_converter = new ArgConverter();
		
		n = arg_converter.convertToInteger(args[0]);
		
		
         SquareMatrix squareMatrix = new SquareMatrix(n);
         
         matrix = squareMatrix.generateSquareMatrix();
         
         
         squareMatrix.printMatrix(matrix);
        
	}

}
