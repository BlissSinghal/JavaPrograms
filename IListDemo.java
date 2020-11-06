package JavaWork;
import java.util.ArrayList;
import java.util.List;
public class IListDemo {
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<> ();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i: list) {
			System.out.println(i);
		}
	}
}
