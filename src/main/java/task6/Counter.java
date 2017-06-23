package task6;

public class Counter {
	
	public double a;
	
	public double b;
	
	public double c;
	
	
    public Counter(double a, double b, double c) {
		
		this.a = a;
		
		this.b = b;
		
		this.c = c;
		
	}
	

    public double countMax() {
    	
        if ( (a > b) && (a > c) ) {
        	
            return a;
            
        } 
        
        else if ( (b > a) && (b > c) ) {
        	
            return b;
            
        } 
        
        else if ( (c > a) && (c > b) ) {
        	
            return c;
            
        }
        
        else if ( (a==b) && (a > c) && (b > c) ) {
        	
        	return a;
        	
        }
        
        else if ( (a==c) && (a > b) && (c > b) ) {
        	
        	return a;
        	
        }
        
        else if ( (b==c) && (b > a) && (c > a) ) {
        	
        	return b;
        	
        }
        
        else {
        	
        	return a;
        	
        }
        
    }
    
    
    
    public double countMin() {
    	
        if( (a < b) && (a < c ) ) {
        	
            return a;
            
        } 
        
        if ( (b < a) && (b < c) ) {
        	
            return b;
            
        } 
        
        else if ( (c < a) && (c < b) ) {
        	
            return c;
            
        }
        
        else if ( (a==b) && (a < c) && (b < c) ) {
        	
        	return a;
        	
        }
        
        else if ( (a==c) && (a < b) && (c < b) ) {
        	
        	return a;
        	
        }
        
        else if ( (b==c) && (b < a) && (c < a) ) {
        	
        	return b;
        	
        }
        
        else {
        	
            return a;
        	
        }
        
    }
    
    
    public double sumMinMax(double minValue, double maxValue) {
    	
     double sum = minValue + maxValue;
    	  
     return sum;
    	
    }

}
