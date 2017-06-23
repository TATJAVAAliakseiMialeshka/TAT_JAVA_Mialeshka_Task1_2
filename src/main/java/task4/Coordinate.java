package task4;

public class Coordinate {
	
	public double x;
	
	public double y;
	
	
	public Coordinate(double x, double y) {
		
		this.x = x;
		
		this.y = y;
		
	}
	
	
	public boolean isInRange() {
		
		if ((x >= -4 && x <=4) && (y <= 4 && y >= -3)) {
			
			if ((y > 0) && (x <=2 && x >= -2)) {
				
				return true;
				
			}
			
			else if ((y <= 0) && (x >= -4 && x <= 4)) {
				
				return true;
				
			}
			
			else {
				
				return false;
				
			}
			
		
		}
		
		else {
			
			return false;
			
		}
	
	}

}
