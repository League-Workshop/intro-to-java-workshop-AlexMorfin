package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot alex = new Robot();
	alex.setSpeed(100);
	alex.turn(180);
	alex.penDown();
	alex.setPenColor(255,0,0);
	alex.move(100);
	alex.turn(90);
	alex.move(100);
	alex.turn(90);
	alex.move(100);
	alex.turn(90);
	alex.move(100);
	alex.penUp();
	alex.move(1000);
	}
}
