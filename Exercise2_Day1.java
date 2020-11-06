package JavaWork;

import javax.swing.JOptionPane;

public class Exercise2_Day1 {
	String firstName = JOptionPane.showInputDialog(null, "What's your first name?");
	String lastName = JOptionPane.showInputDialog(null, "What's your last name?");
	String msg = "Your name reversed is " + String.valueOf(lastName) + ", " + String.valueOf(firstName);
	JOptionPane.showMessageDialog(null, msg);
}