package JavaWork;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class State {
	public static void getInput() {
		String input = JOptionPane.showInputDialog(null, "Enter a name of a state and the year it became a state (seperated by whitespace");
		StringTokenizer test = new StringTokenizer(input);
		if (test.countTokens()!= 2) {
			JOptionPane.showMessageDialog(null, "Error");
			
		}
		else {
			String state = test.nextToken();
			String year = test.nextToken();
			int year1 = Integer.parseInt(year);
			System.out.println(state + " " + String.valueOf(year1));
			
			
		}
	}
}
