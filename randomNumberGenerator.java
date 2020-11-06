package JavaWork;
import java.util.Random;
public class randomNumberGenerator {
	Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void randomNumber1 () {
		int num1 = random.nextInt(10);
		System.out.print(num1);
	}
	public void randomNumber2() {
		int num2 = random.nextInt(10) -5; 
		System.out.print(num2);
	}
	public void randomNumber3() {
		int num3 = random.nextInt(20) + 30;
		System.out.println(num3);
		
	}
	
}
