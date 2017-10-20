package edu.fairport.robocode.robots.samples;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class KevinsTestRobot extends Robot {

	@Override
	public void run() {
		while (true) {
			ahead(200);
            turnGunRight(360);
            back(200);
            turnGunRight(360);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
