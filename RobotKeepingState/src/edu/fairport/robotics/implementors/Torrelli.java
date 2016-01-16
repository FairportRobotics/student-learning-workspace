package edu.fairport.robotics.implementors;

import edu.fairport.robotics.interfaces.AbstractRobot;
import edu.fairport.robotics.interfaces.GiveMeLightSensor;
import edu.fairport.robotics.interfaces.GiveMeProximitySensor;
import edu.fairport.robotics.interfaces.LightSensorIF;
import edu.fairport.robotics.interfaces.ProximitySensorIF;
import edu.fairport.robotics.master.Master;

public class Torrelli extends AbstractRobot implements GiveMeLightSensor, GiveMeProximitySensor {

	
	double meters = 0;
	double lumens = 0; 
	
	
	@Override
	public void giveMeProximitySensor(ProximitySensorIF proximitySensor) {
		// TODO Auto-generated method stub
		meters = proximitySensor.getDistanceInMeters();
		
	}

	@Override
	public void giveMeLightSensor(LightSensorIF lightSensor) {
		// TODO Auto-generated method stub
		lumens = lightSensor.getIntensity();
		
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
		if(meters <= Master.MIN_DISTANCE && lumens >= Master.MAX_INTENSITY)
		{
			this.doTheThing();
		}
		

	}

	
}
