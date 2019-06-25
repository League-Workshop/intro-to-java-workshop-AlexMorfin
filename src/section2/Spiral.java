package section2;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

import apple.laf.JRSUIConstants.FrameOnly;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		
		// 5. Set your robot's pen down 
		
		// 3. Set the robot to go at max speed (100)
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			Robot alex= new Robot();
			alex.changeRobot("http://www.pngmart.com/files/8/Pineapple-PNG-Transparent-Photo.png");
			alex.penDown();
			alex.setSpeed(100);
	for (int i = 0; i < 75; i++) {
	alex.setRandomPenColor();
	alex.move(5*i);
	alex.turn(360/7);
	alex.setPenWidth(i);
	}
	}
}
