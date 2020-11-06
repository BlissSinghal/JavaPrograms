package JavaWork;

import javax.swing.JOptionPane;

public class DecimalAverage {
	double decimal1;
	double decimal2;
	double decimal3;
	public void askUser() {
		 decimal1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a decimal number: "));
		 decimal2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Enter another decimal number: "));
		decimal3 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third decimal number: "));
	}
	public double findAverage() {
		double average = (decimal1 + decimal2 + decimal3) / 3;
		return average;
	}
}
