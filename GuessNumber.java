package JavaWork;
import java.util.Random;

import javax.swing.JOptionPane;
public class GuessNumber extends Game{
	 private Random random;
	 private int userNumber;
	 private int secretNumber;
	 
	 
	 
	 while(shouldContinue) {
		 showUpdatedStatus();
		 askUserNext();
		 
	 }
	 public GuessNumber() {
		 random = new Random();
		 secretNumber = random.nextInt(100) + 200;
		 askUserNext();
	 }
	 public void askUserNext() {
		 String msg = "Guess a number between 200 and 300";
		 String str = JOptionPane.showInputDialog(null,msg);
		 if (str.equals(null)) {
			 userNumber = -1;
		 }
		 else {
			 userNumber = Integer.parseInt(str);
		 }
		 
	 }
	 public boolean shouldContinue() {
		 boolean continue1 = userNumber != secretNumber;
		 if(userNumber + 1 == secretNumber || userNumber - 1 == secretNumber ||userNumber - 2 == secretNumber || userNumber + 2 == secretNumber) {
			 JOptionPane.showMessageDialog(null, "So close,you win");
			 continue1 = false;
		 }
		 return continue1;
	 }
	 public void showUpdatedStatus() {
		 if(userNumber < secretNumber) {
			 JOptionPane.showMessageDialog(null, "Your number was too low");
		 }
		 else if (userNumber > secretNumber) {
			 JOptionPane.showMessageDialog(null, "Your number was too high");
		 }
		
	 }
}
	 //The most number of guess it would take a really smart person to guess the answer is 7 guesses
	 //binary strategy
