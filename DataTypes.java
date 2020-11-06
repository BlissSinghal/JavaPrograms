package JavaWork;

public class DataTypes {
	public int round(double val) {
		
		int result  = Integer.valueOf((int) (val + 0.5));
		return result; 
	}
	public boolean equals(double val1, double val2, double epsilon) {
		epsilon = .00001;
		boolean result = false;
		if (Math.abs(val2-val1) < epsilon|| val2 - val1 == 0 ) {
			result = true;
		}
		
		return result; 
	}
}
