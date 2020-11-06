package JavaWork;

import javax.swing.JOptionPane;

public class IOUtils {

	private IOUtils () {
		
	}
	public static void say (String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	public static String askLine(String prompt) {
		String line = JOptionPane.showInputDialog(null, prompt);
		return line;
	}
	public static double askDouble(String prompt) {
		String input = JOptionPane.showInputDialog(null, prompt);
		double value = 0.0;
		try {
			Double.parseDouble(input);
			value = Double.parseDouble(input);
		}
		catch(NumberFormatException exc) {
			JOptionPane.showMessageDialog(null, "Error", input, JOptionPane.ERROR_MESSAGE, null);
			value = Double.NaN;
		}
		 
		
		return value;
	}
	public static int askInt(String prompt) throws OpException {
		String input = JOptionPane.showInputDialog(null, prompt);
		int value = 0;
		if (input == null) {
			throw new OpException("Enter something in!!!");
		}
		try {
			Integer.parseInt(input);
			value = Integer.parseInt(input);
		}
		catch (NumberFormatException exc) {
			JOptionPane.showMessageDialog(null, "Error", input, JOptionPane.ERROR_MESSAGE, null);
			value = Integer.MIN_VALUE;
		}
		return value;
	}
	public static int askNonNegInt(String prompt) {
		boolean positive = true;
		int integer = 0;
		while (positive ) {
			
				String input = JOptionPane.showInputDialog(null, prompt);
				 integer = Integer.parseInt(input);
				 if (integer < 0) {
						System.out.println("Error, try again");
						positive = true; 
					}
				 else {
					 positive = false;
					 break;
				 }
				
			
			
		}
		return integer; 
		}
	public static int askNearestInt(String prompt) {
		String input = JOptionPane.showInputDialog(null, prompt);
		int result = 0;
		try {
			Double.parseDouble(input);
			double val = Double.parseDouble(input);
			result = (int)(val + 0.5);
			
		}
		catch(NumberFormatException exc) {
			System.out.println("Error");
			result = 0;
		}
		return result;
	}
	
	}
	

