package JavaWork;

import javax.swing.JOptionPane;

public class GermanExchangeRate {

	public static void main(String[] args) {
		GermanExchangeRate g = new GermanExchangeRate();
		System.out.print(g.askUser("What is the exchange rate?"));
		

	}
	private static double askUser(String prompt) {
		double result = Double.parseDouble(JOptionPane.showInputDialog(null, prompt));
		return result; 
	}
	private static double convertDollars(double result) {
		
	}
}
