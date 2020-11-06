package JavaWork;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Name2 {
	public static void getName() {
		String input = JOptionPane.showInputDialog(null, "Enter first name, last name, and year of birth (seperated by white space)");
		StringTokenizer name = new StringTokenizer(input);
		if (name.countTokens() != 3) {
			System.out.println("Error");
		}
		else {
			String first = name.nextToken();
			String last = name.nextToken();
			int year = Integer.parseInt(name.nextToken());
			int current = 2020;
			System.out.println("The name is " + first + ", " + last + " and the year is " + String.valueOf(year));
			System.out.println("The child is now " + String.valueOf(current-year) + " years old");
			
		}
	}
}
