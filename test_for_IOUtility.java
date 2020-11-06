package JavaWork;

public class test_for_IOUtility {
	
	public static void main(String[] args) {
	
		
	

	}
	private static boolean isValidNumber(String num) {
		boolean valid = false;
		try {
			Double.parseDouble(num);
			valid = true;
			System.out.println(num);
			System.out.println("No errors");
		}
		catch (NumberFormatException exc){
			System.out.println("Cannot convert this into a double.");
			valid = false;
		}
		return valid;
	}

}
