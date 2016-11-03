package edu.fairport.robocode.robots.samples;

import robocode.*;

public class TheIDunnoRobot extends Robot {

	public void run() {
		ahead(150);
		back(150);
		turnGunRight(360);
	}
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
		ahead(100);
		turnRight(90);
			
			
		}
	}

