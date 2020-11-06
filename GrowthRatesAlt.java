package JavaWork;

import javax.swing.JOptionPane;

public class GrowthRatesAlt {
	public void execute () {
		double rate = askRate();
		while( rate > 0) {
			int years = yearsToDouble(rate);
			System.out.println("It would take you at least" + years + " years to double your money");
			
		}
	}
	public int yearsToDouble(double rate) {
		int balance = 100;
		
		int years = 0;
		while (balance <= balance*2) {
			balance += rate/100 * balance;
			years ++;
		}
		
		return years + 1; 
	}
	public double askRate() {
			double rate = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your interest rate?"));
			return rate;
		}
	
}
