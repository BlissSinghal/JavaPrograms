package JavaWork;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import uw.syp.java.tools.Buffin;
public class Worker implements Comparable <Person> {
	
	
	private final String firstName;
	private final String lastName;
	private final int birthYear;
	private final double payRate;
	private final double[] hoursPerDay;
	
	public Worker (String input)
			throws IllegalArgumentException, NumberFormatException, BadWorkerException
	{
		
		StringTokenizer test = new StringTokenizer(input);
		firstName = test.nextToken();
		lastName = test.nextToken();
		String birth = test.nextToken();
		String pay = test.nextToken();
		if (firstName == null || lastName == null || pay == null || birth == null) {
			throw new BadWorkerException("Invalid number of fields");
		}
		else {birthYear = Integer.parseInt(birth);
		payRate = Double.parseDouble(pay);}
		hoursPerDay = new double [5];
		for (int i = 0; i < 5; i++ ) {
			hoursPerDay[i] = Double.parseDouble(test.nextToken());
		}
		
		
	}
	
	public  double[] getHoursPerDay() {
		return hoursPerDay;
	}
	public double getHoursPerDay(int day) 
	throws ArrayIndexOutOfBoundsException
	{
		return hoursPerDay[day];
	}
	public double getHoursWorked() {
		double sum = 0;
		for (double i: hoursPerDay) {
			sum += i;
		}
		return sum;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public double getPayRate() {
		return payRate;
	}
	static List<Worker> getWorkers() throws NumberFormatException, IllegalArgumentException, BadWorkerException {
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
		List <Worker> getWorkers = new ArrayList<>();
		for (int i = 0; i < getWorkers.size(); i++) {
			String line1 = buff.readLine();
			getWorkers.add(i,new Worker(line1));
		}
		return getWorkers;
	}
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append(lastName).append(", ").append(firstName).append(" payrate = ").append(payRate).append(" birth year= ").append(birthYear)
		.append("hours per day = ");
		for (int i = 0; i < hoursPerDay.length; i++) {
			b.append(hoursPerDay[i]).append(", ");
		}
		return String.valueOf(b);
	}


	
	public int compareTo(Worker that) {
		int result = 0;
		if (this.lastName.compareTo(that.lastName) != 0) {
			result = this.lastName.compareTo(that.lastName);
		}
		else {
			result = this.firstName.compareTo(that.firstName);
		}
		return result;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
