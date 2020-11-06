package JavaWork;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class smallestNumberGenerator {

	public static void main(String[] args) {
		smallestNumberGenerator test = new smallestNumberGenerator();

	}
	public smallestNumberGenerator() {
		String intValues = JOptionPane.showInputDialog(null, "Enter a sequence of integers and seperate them with a comma (the greatest length could be 6)");
		String [] valueSplit = intValues.split(", ", 6);
		int value1 = Integer.parseInt(valueSplit[0]);
		int value2 = Integer.parseInt(valueSplit[1]);
		int value3 = Integer.parseInt(valueSplit[2]);
		int value4 = Integer.parseInt(valueSplit[3]);
		int value5 = Integer.parseInt(valueSplit[4]);
		int value6 =  Integer.parseInt(valueSplit[5]);
		int sequence [] = {value1, value2, value3, value4, value5, value6};
		Arrays.sort(sequence); 
		System.out.println("The smallest value in the array is " + sequence[0]);
	}
	

}
