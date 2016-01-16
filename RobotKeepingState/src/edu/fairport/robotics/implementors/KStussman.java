package edu.fairport.robotics.implementors;

import edu.fairport.robotics.interfaces.AbstractRobot;
import edu.fairport.robotics.interfaces.GiveMeLightSensor;
import edu.fairport.robotics.interfaces.GiveMeProximitySensor;
import edu.fairport.robotics.interfaces.LightSensorIF;
import edu.fairport.robotics.interfaces.ProximitySensorIF;
import edu.fairport.robotics.master.Master;

public class KStussman extends AbstractRobot implements GiveMeLightSensor, GiveMeProximitySensor {

	double ps;
	double ls;
	
	@Override
	public void tick() {
		
		if (ps < Master.MIN_DISTANCE && ls > Master.MAX_INTENSITY) {
			this.doTheThing();
		}
		
	}

	@Override
	public void giveMeProximitySensor(ProximitySensorIF proximitySensor) {
		ps = proximitySensor.getDistanceInMeters();
		
	}

	@Override
	public void giveMeLightSensor(LightSensorIF lightSensor) {
		ls = lightSensor.getIntensity();
	}
}
