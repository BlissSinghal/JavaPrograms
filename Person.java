package JavaWork;

public class Person {
	private String firstName;
	private static int numPersons = 0;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private int age;
	
	public Person (String first, String last) {
		firstName = first;
		lastName = last; 
		numPersons++;
	}
	public static int getNumber() {
		return numPersons;
	}
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge(int currentYear) {
		age = currentYear - birthYear;
		if (age <= 0) {
			return 0;
		}
		else {
			return age;  
		}
	}
	public void birthday(int month, int day, int year) {
		birthMonth = month;
		birthDay  = day;
		birthYear = year;
	}
}
