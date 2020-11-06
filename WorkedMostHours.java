package JavaWork;

import java.util.List;

import uw.syp.java.tools.Buffin;

public class WorkedMostHours {

	public static void main(String[] args) throws NumberFormatException, IllegalArgumentException, BadWorkerException {
		List<Worker> workers = Worker.getWorkers();
		workers.sort(new SortByHours());

	}
	public WorkedMostHours() throws NumberFormatException, IllegalArgumentException, BadWorkerException {
		OldestWorker work = new OldestWorker();
		Worker getWorkers[] = OldestWorker.getWorkers();
		double mostHours = getWorkers[0].getHoursWorked();
		for (int i = 0; i < getWorkers.length; i++) {
			double hours = getWorkers[i].getHoursWorked();
			if (hours > mostHours) {
				mostHours = hours;
			}
		}
	}
		
		

}
