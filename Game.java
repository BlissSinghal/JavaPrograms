package JavaWork;

import javax.swing.JOptionPane;

public class Game {
	private String secretWord;
	private String user_guess; 
	private int guessCount = 0; 
	private String again;
	public void playGame() {
		setUserInput();
		while (shouldContinue()) {
			setUserInput();
		
		}
		youWon();
		showGuess();
	}
	
	public void setUserInput() {
		String game = JOptionPane.showInputDialog(null, "Enter your guess");
		user_guess = game;
		guessCount++;
	}
	
	public boolean shouldContinue() {
		if (user_guess.equals(secretWord)) { 
			return false;
		}
		else {
			changingSecretWord();
			return true; 
			
		}
	}
	public void youWon() {
		JOptionPane.showMessageDialog(null,"You won! Congrats");
	}
	public void showGuess() {
		JOptionPane.showMessageDialog(null, "It took you " + String.valueOf(guessCount - 1) + " guesses to get the secret word.");
	}
	public boolean playAgain () {
		again = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
		if (again.equals(JOptionPane.YES_OPTION)) {
			return true;
		}
		else {
			return false;
		}
	}
	public void playingAgain () {
		playAgain();
		if (playAgain()) {
			playGame(); 
		}
	}
	public void changingSecretWord() {
		if (guessCount == 2) {
			JOptionPane.showMessageDialog(null, "Haha, I changed the secret word!! Guess again");
		}
		if (guessCount >= 2) {
			secretWord = "cat";
		}
		else {
			secretWord = "dog";
		}
	}
} 
