package edu.fairport.robotics.implementors;

import edu.fairport.robotics.interfaces.AbstractRobot;
import edu.fairport.robotics.interfaces.GiveMeLightSensor;
import edu.fairport.robotics.interfaces.GiveMeProximitySensor;
import edu.fairport.robotics.interfaces.LightSensorIF;
import edu.fairport.robotics.interfaces.ProximitySensorIF;
import edu.fairport.robotics.master.Master;

public class ABush extends AbstractRobot implements GiveMeLightSensor, GiveMeProximitySensor {
	

	private double dist;
	private double light;

	@Override
	public void giveMeProximitySensor(ProximitySensorIF proximitySensor) {
		// TODO Auto-generated method stub
		dist= proximitySensor.getDistanceInMeters();

	}

	@Override
	public void giveMeLightSensor(LightSensorIF lightSensor) {
		// TODO Auto-generated method stub
		light=lightSensor.getIntensity();

	}
	
	public void tick()
	{
		if(dist<=Master.MIN_DISTANCE&&light>=Master.MAX_INTENSITY)
		{
			this.doTheThing();
		}
	}
	
	

}
