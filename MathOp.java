package JavaWork;

public class MathOp {

	private MathOp () {
		
	}
	public static int powerOf2(int expo) {
		// TODO Auto-generated method stub
		int power = 1;
		if (expo > 30) {
			expo = 30;
		}
		for (;expo > 0; --expo ) 
			power = power * 2;
		return power; 
	}
	public static int powerOf2Alt(int expo) {
		int power = 1;
		if (expo > 30) {
			expo = 30;
		}
		for (int inx = 0; inx < expo; ++inx)
			power = power * 2;
		return power;
	}
	public static int average(int sum, int count) {
		int average = 0;
		if (sum>= 0 ) 
			average = (sum + count / 2) / count;
		else if (count == 0) {
			average = 0;
		}
		else 
			average  = (sum - count /2 ) / count;
		return average;
	}
	public static double circumference(double radius) {
		double circumference = radius * 2 * Math.PI;
		return circumference;
	}
	public static double area(double radius) {
		double area = radius * radius * Math.PI;
		return area;
	}
	public static int power(int base, int expo) {
		int result = base;
		
		for (; expo >= 2; --expo) {
			result  = result * result;
		}
		return result;
	}
	public static int gcd(int one, int two) {
		int gcd = 0;
		for (int counter = 1; counter <= two; ++counter) {
			int resultOne = one % counter;
			int resultTwo = two % counter;
			if (resultOne == 0 && resultTwo == 0) {
				gcd = counter;
			}
		
		}
		return gcd; 
	}

}
