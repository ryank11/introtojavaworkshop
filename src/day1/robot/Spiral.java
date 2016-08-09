package day1.robot;

import org.jointheleague.graphical.robot.Robot;
 
public class Spiral {
int a=0;
	public static void main(String[] args) {
	
		// 1. Create a new Robot
		Robot spiker= new Robot("batman");
		// 5. Set your robot's pen to the down position
spiker.penDown();
		// 3. Set the robot to go at max speed (10)
          spiker.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
             for(int a=0; a<300;a++){
			// 7. Change the pen color to random
	spiker.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	spiker.move(5*a);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	         spiker.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
            spiker.setPenWidth(a);
             
             }
	}
}

