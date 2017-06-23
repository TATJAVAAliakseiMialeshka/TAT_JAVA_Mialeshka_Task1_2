package util;

public class ArgValidator {
	
	
	public int actual_args_length;
	
	public int expected_args_length;
	
	
	
	public ArgValidator(int actual_args_length, int expected_args_length) {
		
		this.actual_args_length = actual_args_length;
		
		this.expected_args_length = expected_args_length;
	
	}
	
	
	
	public boolean checkCorrectNumberOfArguments() {
		
		 if (actual_args_length != expected_args_length) {
			
		      throw new InvalidArgException
		      ("You have entered incorrect data: invalid number of arguments.");
		  
		 }
		 
		 else {
			 
		  return true;
			 
		 }

    }

}
