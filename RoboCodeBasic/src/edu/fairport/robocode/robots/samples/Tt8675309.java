package edu.fairport.robocode.robots.samples;

import robocode.Robot;

public class Tt8675309 extends Robot {

public void run()
{
			
	while (true)
	{
		ahead(20);
		turnGunLeft(360);
		fire(2);
		turnLeft(90);
		back(50);
		turnGunRight(360);
		fire(2);
		turnRight(50);
		fire(2);
	}
}

}
