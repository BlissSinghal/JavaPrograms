package JavaWork;

import javax.swing.JOptionPane;

public class WorkerException {

	public static void main(String[] args) throws OpException, BadWorkerException {
		try {
			IOUtils.askInt("Ask int");
		}
		catch(OpException exc) {
			System.out.print("Invalid input");
		}
		try {
			Worker hi = new Worker("what??");
		}
		catch(NumberFormatException exc) {
			throw new BadWorkerException ("Invaild field value", exc);
		}
		try {
			Worker worker1 = new Worker("ho he j 7 8 9 9 8 9");
			worker1.getLastName();
		}
		catch(NumberFormatException exc) {
			JOptionPane.showMessageDialog(null, "Invalid Input!", null, JOptionPane.ERROR_MESSAGE);
		}
		catch(IllegalArgumentException exc) {
			JOptionPane.showMessageDialog(null, "Invalid Input!", null, JOptionPane.ERROR_MESSAGE);
		}

	}
	
		

	

}
