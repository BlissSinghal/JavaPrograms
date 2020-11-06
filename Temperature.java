package JavaWork;

public class Temperature {
	private double celsius;
	private double fahrenheit;
	private String strCelsius;
	public Temperature (double temp) {
		celsius = temp;
	}
	public Temperature(double temp, String scale) {
		String first = String.valueOf(scale.charAt(0));
		if (first.equals("f") || first.equals("F")) {
			toCelsius(temp);
		}
		else {
			setCelsius(temp);
			
		}
	}
	public double getCelsius(double fahrenheit) {
		celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
	public double getFahrenheit(double celsius) {
		fahrenheit = (celsius *9/5) + 32;
		return fahrenheit;
	}
	public void setCelsius(double temp) {
		celsius = temp;
	}
	public void setFahrenheit(double temp) {
		fahrenheit = temp;
	}
	public void toCelsius(double temp) {
		setFahrenheit(temp);
		getCelsius(fahrenheit);
	}
	public String toString() {
		strCelsius = String.valueOf(celsius) + "C";
		return strCelsius; 
	}
}
