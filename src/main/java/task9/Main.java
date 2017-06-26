package task9;


import util.ArgConverter;


public class Main {
	
	public static final String USAGE = "Enter k as first argument, then enter first array, "
			+ "then enter second array and number of position of the argument, where second array starts"
			+ "(first argument has 0 position).";
	
	
	 public static void main(String[] args) {
			
			int k;
			
			int first_array_converted[];
			
			int second_array_converted[];
			
			int separating_point;
			
			int [] joinedArray;
			
			
			
			ArgConverter arg_converter = new ArgConverter();
			
			k = arg_converter.convertToInteger(args[0]);
			
			separating_point = arg_converter.convertToInteger(args[args.length - 1]);
			
			
			Array array = new Array();
			
			String[] first_array = array.getFirstArray(args, separating_point);
			
			String[] second_array = array.getSecondArray(args, separating_point);
			
			
			first_array_converted = arg_converter.convertToIntArray(first_array);
			
			second_array_converted = arg_converter.convertToIntArray(second_array);
			
			
			joinedArray = array.joinArrays(first_array_converted, second_array_converted, k);
			
			
			array.printArray(joinedArray);
			
	        
		}

}
