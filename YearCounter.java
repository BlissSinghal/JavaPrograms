package JavaWork;

import uw.syp.java.tools.Buffin;

public class YearCounter {

	public static void main(String[] args) throws BadWorkerException{
		int[] years = new int [7];
		Buffin buff = new Buffin("Worker.txt");
		if (buff.isStdIn()) {
			System.out.println("File not found");
		}
		String line = buff.readLine();
		while (line != null ) {
			Worker worker = new Worker(line);
			int year = worker.getBirthYear();
			int i  = 1996 - year;
			if (i < 0) {
				++years[0];
			}
			else if (year > years.length) {
				
			}
			
		}
		

	}

}
