package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	
	// 1. Create a new Robot
Robot spiker= new Robot("batman");
	
	void go() {
		 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
spiker.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int o=50;
		// 7. Do the following (up to step 10) 60 times
              for(int o=50;o<60;o++);
			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int l ) {
		spiker.move(l);
		spiker.turn(360/3);
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
