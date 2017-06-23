package task1;

import util.InvalidArgException;

public class Counter {
	
	
	public boolean isFourDigit(int number) {
   	 
   	 int number_mod = Math.abs(number);
		 
		 if (number_mod < 1000 || number_mod > 9999) {
				
			  throw new InvalidArgException
			        ("You have entered incorrect data: enter FOUR-DIGIT integer.");
			  
		   }
		 
		 
			 return true;
		
	 }
	
	
	public boolean isTwoDigit(int number) {
	   	 
	   	 int number_mod = Math.abs(number);
			 
			 if (number_mod < 10 || number_mod > 99) {
					
				  throw new InvalidArgException
				        ("You have entered incorrect data: enter TWO-DIGIT integer.");
				  
			   }
			 
				 
				 return true;
			
		 }
	
	
	public int sumFirstTwoNumbers(int number) {
		
	if (this.isFourDigit(number) == true) {
		
		 int sum_of_first_two_digits = 0; 
		
		 int remainder; 

		 int a = number/100;
		 
		   for ( int g = a; g>0; g = g/10 ) { 

		        remainder = g%10; 

		        sum_of_first_two_digits =  sum_of_first_two_digits + remainder; 

		     
		   } 

		   return sum_of_first_two_digits; 

	 }
		
		else {
			
			 throw new InvalidArgException
		        ("You have entered incorrect data: enter FOUR-DIGIT integer.");
			
		}
		
	  }
	
	
	
    public int sumSecondTwoNumbers(int number) { 
    	
    	if (this.isFourDigit(number) == true) {
	  
	      int sum_of_second_two_digits = 0;
	
	      int remainder; 

	        for (int i = number; i>=100; i = i/10 ) { 

	              remainder = i%10; 

	              sum_of_second_two_digits =  sum_of_second_two_digits + remainder; 

	         } 
     
	   
	     return sum_of_second_two_digits; 
	     
    	}
    	
    	else {
    		
    		throw new InvalidArgException
	        ("You have entered incorrect data: enter FOUR-DIGIT integer.");
    		
    	}

	 } 
    
    

    public boolean compareSums (int firstSum, int secondSum) {
	 
    	if ( (this.isTwoDigit(firstSum) == true) && (this.isTwoDigit(firstSum) == true) ) {
	 
	       if (firstSum == secondSum) {
		  
		       return true;
		  
	       }
	  
	       else {
		  
		       return false; 
		       
	       }
	       
    	}
    	
    	else {
    		
    		throw new InvalidArgException
	        ("You have entered incorrect data: enter TWO-DIGIT integer.");
    		
    	}
	  
     }

}
