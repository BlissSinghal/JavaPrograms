package JavaWork;

import javax.swing.JOptionPane;

public class Exercise1_Day1 {

	public static void main(String[] args) {
		String string1 = JOptionPane.showInputDialog(null, "Give me one string");
		String string2 = JOptionPane.showInputDialog(null, "Give me another string");
		//System.out.println(string1);
		//System.out.println(string2);
		
		if (string1.isEmpty() || string2.isEmpty() || string1 == null || string2 == null) {
			System.out.println("Stop Fooling Around");
		}
		else {
			if (string1.equals(string2)) {
			System.out.println("equal");
			}
			else {
			System.out.println("different");
		

	}

}
