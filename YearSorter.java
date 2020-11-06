package JavaWork;

import java.util.Comparator;

public class YearSorter implements Comparator<Worker>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int compare(Worker worker, Worker worker1) {
		int result = worker.getBirthYear() - worker1.getBirthYear();
		return result;
	}

}
