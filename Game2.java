package JavaWork;
import javax.swing.JOptionPane;
public class Game2 {
	private String secretWord;
	private String user_guess; 
	private String guessCount = ""; 
	private String again;
	public void playGame() {
		setUserInput();
		while (shouldContinue()) {
			setUserInput();
		
		}
		youWon();
		
	}
	
	public void setUserInput() {
		String game = JOptionPane.showInputDialog(null, "Enter your guess");
		user_guess = game;
		guessCount += "x";
	}
	
	public boolean shouldContinue() {
		if (user_guess.equals(secretWord)) { 
			return false;
		}
		if (guessCount.equals("xxxxx")) {
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

	public boolean playAgain () {
		again = JOptionPane.showConfirmDialog(null, "Do you want to play again");
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
		if (guessCount.equals("")) {
			secretWord = "dog";
			
		}
		else if (guessCount .equals("x")) {
			JOptionPane.showMessageDialog(null, "Haha, I changed the secret word!! Guess again");
			secretWord = "cat";
		}
		
		else {
			secretWord = "cat";
		}
	}
} 


