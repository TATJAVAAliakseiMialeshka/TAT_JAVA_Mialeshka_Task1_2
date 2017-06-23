package task2;

public class Counter {
	
    public double a;
	
	public double b;
	
	public double c;
	
	
	public Counter(double a, double b, double c) {
		
		this.a = a;
		
		this.b = b;
		
		this.c = c;
		
	}
	
	public double calculateByFormula() {
		
	  if (a != 0) {
		  
		  if( (4*a*c < 0) && (b*b < Math.abs(4*a*c)) ) {
		
			  throw new IncompatibleArgumentsException("Incorrect entered data: incompatible arguments."
						+ " The square root expression can not be negative.");
	  
		       }
		  
		  else {
			  
			  
			  double result = 0;
				
			     
              result = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b, -2);
		
	
	          return result;
			  
			  
		  }
	  
	  }
	  
	  else {
		  
		  throw new IllegalArgumentException ("Incorrect entered data: argument \"a\" "
			  		+ "can not be equal to zero. Because zero can "
			  		+ "not be divided in the denominator.");
		  
	  }
	  
	
	}
	
}
