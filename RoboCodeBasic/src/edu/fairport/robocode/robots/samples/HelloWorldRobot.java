package edu.fairport.robocode.robots.samples;

import robocode.*;

public class HelloWorldRobot extends Robot {
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