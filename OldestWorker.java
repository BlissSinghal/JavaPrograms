package JavaWork;

import uw.syp.java.tools.Buffin;

public class OldestWorker {

	public static void main(String[] args) throws BadWorkerException {
		// TODO Auto-generated method stub
		OldestWorker old = new OldestWorker();
		old.execute();
	}
	public void execute() throws BadWorkerException{
		Worker[] workers = getWorkers();
		Worker oldest = workers.length > 0 ? workers[0]: null;
		for (Worker worker: workers) {
			int workerYear = worker.getBirthYear();
			int oldestYear = oldest.getBirthYear();
			if (workerYear < oldestYear) {
				oldest = worker;
			}
		}
		System.out.println(oldest.getLastName() + ", " + oldest.getFirstName() + " Year: " + oldest.getBirthYear());
	}
	static Worker[] getWorkers() throws NumberFormatException, IllegalArgumentException, BadWorkerException {
		Buffin buff = new Buffin("Workers.txt");
		if (buff.isStdIn()) {
			System.out.println("File not found");
		}
		String line = buff.readLine();
		int counter = 0;
		while(line != null) {
			counter++;
			line = buff.readLine();
		}
		Worker[] getWorkers = new Worker[counter];
		for (int i = 0; i < getWorkers.length; i++) {
			String line1 = buff.readLine();
			getWorkers[i] = new Worker(line1);
		}
		return getWorkers;
	}

}
