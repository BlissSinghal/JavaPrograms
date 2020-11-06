package JavaWork;

import uw.syp.java.tools.Buffin;

public class testForBuffin {

	public static void main(String[] args) {
		
		
		Buffin buff = new Buffin("Worker.txt");
		testForBuffin.alphabetical(buff);
		
		
		
		
	}
	public static void firstThree(Buffin buff) {
		Worker[] first3 = new Worker [3];
		
		for (int i = 0; i < 3; i++) {
			String line = buff.readLine();
			System.out.println(line);
		}
	}
	public static void alphabetical(Buffin buff) {
		String line = buff.readLine();
		Worker worker = null;
		while (line != null) {
			Worker test = new Worker(line);
			if (test.compareTo(worker) < 0) {
				worker = test;
			}
			line = buff.readLine();
		}
		String first = worker.getFirstName();
		String last = worker.getLastName();
		String name = last  + ", " + first;
		System.out.println(name);
	}
	
}
