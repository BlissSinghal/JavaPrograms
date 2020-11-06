package JavaWork;

import javax.swing.JOptionPane;

public class jOptionPane{

	public static void main(String[] args) {
		
		//second exercise
		String firstName = JOptionPane.showInputDialog(null, "What's your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What's your last name?");
		JOptionPane.showMessageDialog(null, "Your name reversed is " + String.valueOf(lastName) + ", " + String.valueOf(firstName));
		
		}
	

}


