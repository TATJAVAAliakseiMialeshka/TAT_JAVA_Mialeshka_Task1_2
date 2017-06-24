package task8;

import util.InvalidArgException;

public class Counter {
	
	
	public int K;
	
	public int[] array_of_natural_numbers;
	
	
	public int extractA (int[] array) {
		
		if (array.length > 0) {
		
		  K = array[0];
		
		  return K;
		
		}
		
		else {
			
			throw new InvalidArgException("Array is null.");
			
		}
		
	}
	
	
	
	public int[] extractArrayOfNaturalNumbers (int[] array) {
		
		int[] array_of_natural_numbers = new int[array.length - 1];
		
		if (array.length > 0) {
			
			  for (int i = 1; i < array.length; i++) {
				  
				  if (array[i] <= 0) {
			    		
			    	throw new InvalidArgException
					 ("You have entered incorrect data: only natural numbers are valid for this method.");
			    	
			      }
				  
				  array_of_natural_numbers[ i-1 ] = array[i]; 
				 
			  }
			  
		
		return array_of_natural_numbers;
		
			
		}
			
			else {
				
				throw new InvalidArgException("Array is null.");
				
			}
		
	}
	
	
	public int countSum(int[] arrayOfNaturalNumbers, int K) {
		
		int sum = 0;
		
		for (int i = 0; i < arrayOfNaturalNumbers.length; i++) {
			
			if (arrayOfNaturalNumbers[i] % K == 0) {
				sum = sum + arrayOfNaturalNumbers[i];
				
			}
			
		}
		
		return sum;
		
	}

}
