package JavaWork;

import uw.syp.java.tools.Buffin;

public class BuffinTestAgain {

	public static void main(String[] args) {
		
		Buffin buff = new Buffin("Worker.txt");
		String line = buff.readLine();
		Worker testWorker = null;
		Worker storedWorker = null;
		if (line != null) {
			storedWorker = new Worker(line) ;
		}
		while (line!= null) {
			
			testWorker = new Worker(line);
			if (testWorker.compareTo(storedWorker)< 0) {
				storedWorker = testWorker;
			}
			line = buff.readLine();
		}
		String last = storedWorker.getLastName();
		String first = storedWorker.getFirstName();
		String name = last + ", " + first;
		System.out.println(name);

	}
	private static void test(String param) {
		try {
			int iVal = Integer.parseInt(param);
			System.out.println(iVal);
		}
		catch(NumberFormatException exc) {
			System.out.println("Invalid input");
		}
	}

}
