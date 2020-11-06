package JavaWork;

public class Time {
	private int hour;
	private int min;
	private String dayOfWeek;
	private static int sum; 
	
	public Time(int hour, int min, String dayOfWeek) {
		this.hour = hour;
		this.min = min;
		this.dayOfWeek = dayOfWeek;
	}
	public Time(Time time) {
		hour = time.hour;
		min = time.min; 
	}
	public Time add(Time toAdd) {
		int newHour = 0; 
		int newMin = 0; 
		newHour = newHour + newMin / 60;
		newMin %= 60;
		newHour %= 24;
		Time result = new Time( newHour, newMin);
		return result; 
	}
	public String toString() {
		String strHour  = "" + hour;
		String strMin = "" + min; 
		if (hour <= 10)
			strHour = "0" + strHour;
			  
		if (min <  10) {
			strMin = "0" + strMin; 
		}
		time = strHour + strMin;
		return time; 
		
	}
	public Time toAdd(Time that) {
		Time.sum = that + Integer.valueOf(time);
		
	}
}
