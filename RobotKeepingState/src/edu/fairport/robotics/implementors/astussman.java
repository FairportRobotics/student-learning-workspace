package edu.fairport.robotics.implementors;

import edu.fairport.robotics.interfaces.AbstractRobot;
import edu.fairport.robotics.interfaces.GiveMeLightSensor;
import edu.fairport.robotics.interfaces.GiveMeProximitySensor;
import edu.fairport.robotics.interfaces.LightSensorIF;
import edu.fairport.robotics.interfaces.ProximitySensorIF;
import edu.fairport.robotics.master.Master;

public class astussman extends AbstractRobot implements GiveMeLightSensor, GiveMeProximitySensor{

	double distance = 0;
	double intensity = 0;
	
	@Override
	public void giveMeProximitySensor(ProximitySensorIF proximitySensor) {
		// TODO Auto-generated method stub
		
		distance = proximitySensor.getDistanceInMeters();
		
	}

	@Override
	public void giveMeLightSensor(LightSensorIF lightSensor) {
		// TODO Auto-generated method stub
		
		intensity = lightSensor.getIntensity();
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
		if(distance < Master.MIN_DISTANCE && intensity > Master.MAX_INTENSITY){
			
			this.doTheThing();
			
		}
		
	}

	
		
		
		
	
	
}
