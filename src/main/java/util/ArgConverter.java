package util;

public class ArgConverter {
	
	
	public int convertToInteger(String arg) {
		 
		 int arg_converted;
		 
		 if (arg != null) {
		 
		 try {
				
			  arg_converted = Integer.parseInt(arg);
			 
			 }
		 
		
		 catch (NumberFormatException e) {
				
			throw new InvalidArgException
			    ("You have entered incorrect data: only integers are valid for input.");

			
		 }
		 
		
		return arg_converted;
		
		 }
		 
		 else {
			 
			 throw new InvalidArgException
			    ("There are no aguments to convert.");
			 
		 }
		 
	 }
	
	
	public double convertToDouble(String arg) {
		 
		 double arg_converted;
		 
		 if (arg != null) {
		 
		 try {
				
			 arg_converted = Double.parseDouble(arg);
		 
			}
		 
		
		 catch (NumberFormatException e) {
				
			 throw new InvalidArgException
				("You have entered incorrect data: only numbers are valid for input.");
		
		 }
		 
		
		 return arg_converted;
		
		 }
		 
         else {
			 
			 throw new InvalidArgException
			    ("There are no aguments to convert.");
			 
		 }
		 
		 
	 }
	
	
	public int[] convertArrayOfNaturalArgumentsToInt(String[] array) {
		
		int [] array_converted = new int[array.length];
		 
		
		
		try {
			
		    for (int i = 0; i < array.length; i++) {
		    	
		    	array_converted[i] = Integer.parseInt(array[i]);
		    	
			
		    	if (array_converted[i] <= 0) {
		    		
		    		throw new InvalidArgException
				     ("You have entered incorrect data: only natural numbers are valid for input.");
		    	
		    	}
			
		    }
		
		}
		
		catch (NumberFormatException e) {
			
			throw new InvalidArgException
			    ("You have entered incorrect data: only natural numbers are valid for input.");

			
		 }
		
		return array_converted; 
	
		
    }

}
