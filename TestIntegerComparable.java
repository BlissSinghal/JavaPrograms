package JavaWork;

import java.util.Arrays;

public class TestIntegerComparable implements Comparable<Integer>{
	private int myVal = 0;
	public static void main(String[] args) {
		TestIntegerComparable test = new TestIntegerComparable(8);
		TestIntegerComparable test1 = new TestIntegerComparable(3);
		TestIntegerComparable test2 = new TestIntegerComparable(67);
		System.out.println(test1.compareTo(test));
		
		TestIntegerComparable [] arr = {test, test1, test2};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr);
		}
		
	}
	
	public TestIntegerComparable(int val) {
		myVal = val;
	}
	public String toString() {
		String result = " " + String.valueOf(myVal);
		return result;
	}
	
	public int compareTo(TestIntegerComparable obj) {
		int result  = myVal - obj.myVal;
		
		return result;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
