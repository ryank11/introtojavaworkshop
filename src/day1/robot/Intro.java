package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Intro {
public static void main(String[] args) {
Robot spiker= new Robot("batman");
spiker.setSpeed(5);
spiker.setPenWidth(1000);
spiker.setRandomPenColor();
spiker.penDown();
spiker.move(300);
spiker.turn(90);
spiker.move(300);
spiker.hide();
Robot bug= new Robot("batman");bug.setSpeed(5);
bug.setPenWidth(1000);
bug.setRandomPenColor();
bug.penDown();
bug.turn(90);
bug.move(300);
bug.turn(270);
bug.move(300);
bug.turn(90);
spiker.show();
bug.turn(90);
spiker.turn(270);
Robot bob= new Robot("batman");
bob.setPenWidth(1000);
bob.setRandomPenColor();
bob.penDown();
bob.turn(45);
bob.move(400);



}
}
