package JavaWork;

public class InterfaceConcreteDemo implements InterfaceDemo{
	public static void main(String[] args) {
		InterfaceDemo demo = new InterfaceConcreteDemo();
		execute();
		
	}
	public void doDemo(int param) {
		System.out.println("This is a demo: " + String.valueOf(param));
	}
	public static void execute( ) {
		demo.doDemo(4);
	}
}
