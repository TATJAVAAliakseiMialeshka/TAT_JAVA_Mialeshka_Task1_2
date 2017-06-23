package task8;

import util.ArgConverter;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array_of_natural_numbers;
		
		int K;
		
		int sum;
		
		
		ArgConverter arg_converter = new ArgConverter();
		
		int[] arguments_array = arg_converter.convertArrayOfNaturalArgumentsToInt(args);
		
		
		Counter counter = new Counter();
		
		
		K = counter.extractA(arguments_array);
		
		array_of_natural_numbers = counter.extractArrayOfNaturalNumbers(arguments_array);
		
		
		sum = counter.countSum(array_of_natural_numbers, K);
		
		
		System.out.println("Sum is " + sum + ".");
	
	}

}
