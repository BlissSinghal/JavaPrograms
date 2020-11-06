package JavaWork;
import java.awt.Color;
import java.util.Arrays;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import uw.syp.java.tools.Turtle;
public class ArrayWork {

	public static void main(String[] args) {
		//runLargest();
		TurtleWork();

	}
	public static void getSqrtArray () {
		double[] doubles = {3.5, 1.3, 6.9, 5.7, 3.8, 3.5, 6.8, 2.1, 4.9, 2.6};
		for (int i  = 0; i < doubles.length; i++) {
			System.out.print(Math.sqrt(doubles[i]));
		}
	}
	public static int[] getArray() {
		String input = JOptionPane.showInputDialog(null, "Enter a sequence of integers, unordered (seperated by whitespace");
		
		StringTokenizer array = new StringTokenizer(input);
		int array1[]  = new int [array.countTokens()-1];
		int count = 0;
		while( count < array1.length) {
			int add = Integer.parseInt(array.nextToken());
			array1[count] = add;
			count++;
		}
		
		return array1;
	}
	public static int getLargest(int[] array) {
		int large = array[0];
		for (int i  = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];
			}
		}
		
		
		
		System.out.println("The largest number in your sequence is " + large);
		return large;
		
	}
	public static void runLargest() {
		getLargest(getArray());
		}
	public static void TurtleWork() {
		Color[] colors = {Turtle.BLACK, Turtle.MAGENTA, Turtle.YELLOW, Turtle.GREEN, Turtle.GRAY, Turtle.BLUE, Turtle.ORANGE, Turtle.WHITE, Turtle.RED, Turtle.ORANGE};
		Turtle[] turtles = new Turtle[colors.length-1];
		for (int i = 0; i < colors.length-1; i++ ) {
			turtles[i].switchTo(colors[i]);
			turtles[i].paint(i*20+ 1,i * 25+4);
			
		}
	}

	}
	
