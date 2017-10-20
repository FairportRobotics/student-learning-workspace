package edu.fairport.robocode.robots.samples;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class BlakesRandomRobot extends Robot{

	@Override
	public void run(){
		while (true) {
			ahead(60);
			turnRight(60);
            turnGunRight(360);
            turnRight(60);
            back(60);
            turnRight(60);
            turnGunRight(360);
            
            turnRight(60);
		}
		
	}
	 public void onScannedRobot(ScannedRobotEvent e){
	        fire(4);

	 }
}
