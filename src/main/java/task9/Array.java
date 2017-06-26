package task9;

import util.InvalidArgException;

public class Array {
	
	
	public int[] joinArrays(int[] first_array, int[] second_array, int k) {
		
		int[] newArray = {};
		
		if ((k > 0 && k < first_array.length)) {
		
		  if ((first_array.length > 0) && (second_array.length > 0)) {
			
			
			newArray = new int[first_array.length + second_array.length];
			
			for (int i = 0; i < k; i++) {
				
				newArray[i] = first_array[i];
				
			}
			
			
			for (int i = 0; i < second_array.length; i++) {
				
				newArray[i + k] = second_array[i];
				
			}
			
			
			for (int i = k; i < first_array.length; i++) {
				
				newArray[i + second_array.length] = first_array[i];
				
			}
			
	      }
		
		else {
			
			throw new InvalidArgException
			   ("Argument k can not be less than 1 or less than length of the first array.");
			
		}
			
		}
		
		return newArray;
		
	}
	
	

	public void printArray(int[] array) {
		
		if (array.length > 0) {
			
			for (int i = 0; i < array.length; i++) {
				
				System.out.print(array[i] + " ");
				
			}

			
		}
		
	}
	
	
	public String[] getFirstArray(String[] args, int separating_point) {
		
       
         
		String [] first_array = new String [separating_point - 1];
		
		for (int i = 0; i < separating_point - 1; i++) {
		
			first_array[i] = args[i + 1];
			
		}
		
		
		return first_array;
		
	}
	
	
    public String[] getSecondArray(String[] args, int separating_point) {
		
		String [] second_array = new String[args.length - separating_point - 1];
		
		for (int i = 0; i < second_array.length; i++) {
			
			second_array[i] = args[args.length - separating_point + i];
			
		}
		
		return second_array;
		
	}


}
