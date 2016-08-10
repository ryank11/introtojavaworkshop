package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Intro {
public static void main(String[] args) {
Robot spiker= new Robot("batman");
spiker.sparkle();
spiker.setSpeed(5);
spiker.setPenWidth(1000);
spiker.setRandomPenColor();
spiker.penDown();
spiker.move(300);
spiker.turn(500);
spiker.hide();
Robot bug= new Robot("batman");bug.setSpeed(5);
bug.setPenWidth(1000);
bug.setRandomPenColor();
bug.penDown();
bug.turn(90);
bug.move(300);
bug.turn(270);









}
}
