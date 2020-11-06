package JavaWork;

import uw.syp.java.tools.Turtle;

public class testMyTurtle {

	public static void main(String[] args) {
		Turtle myTurtle =  new Turtle();
		myTurtle.fillBox(64, 64);
		test(myTurtle);
		myTurtle.fillBox( 64, 64 );

	}
	private static void test(Turtle param) {
		param.move(45, 128);
		param.switchTo(Turtle.GREEN);
	}

}