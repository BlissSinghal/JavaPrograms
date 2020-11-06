package JavaWork;

import java.util.Comparator;

public class SortByHours implements Comparator<Worker>{
	
	
	
	
	public int compare(Worker worker1, Worker worker2) {
		double hi = worker1.getHoursWorked() - worker2.getHoursWorked();
		int result = 0;
		if (hi < 0) {
			result = -1;
		}
		else if (hi > 0) {
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}
}
