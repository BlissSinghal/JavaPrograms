package JavaWork;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Animal {

	public static void main(String[] args) {
		
	}
	
	public static void getAnimal() {
		String prompt = "Enter an animal and a decimal number between 1 and 2 (seperated by whitespace)";
		String input = JOptionPane.showInputDialog(null, prompt);
		StringTokenizer test = new StringTokenizer(input);
		if (test.countTokens() != 2) {
			JOptionPane.showMessageDialog(null, "Wrong input. Stop fooling around.", input, JOptionPane.ERROR_MESSAGE);
		}
		else {
			String animal = test.nextToken();
		Double num = Double.parseDouble(test.nextToken());
		String msg = "The animal was "  + animal + " and your decimal was "  + String.valueOf(num) + ".";
		JOptionPane.showInputDialog(null, msg);
		}
	}

}
