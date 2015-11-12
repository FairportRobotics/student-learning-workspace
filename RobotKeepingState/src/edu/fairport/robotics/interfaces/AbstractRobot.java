package edu.fairport.robotics.interfaces;

import java.util.Random;

public abstract class AbstractRobot {

	private double distance = new Random().nextDouble() * 100;
	private double intensity = new Random().nextDouble();
	private boolean didThing = false;
	private ProximitySensor proximitySensor = new ProximitySensor();
	private LightSensor lightSensor = new LightSensor();

	public void step() {
		stepVals();

		if (this instanceof GiveMeProximitySensor) {
			((GiveMeProximitySensor) this).giveMeProximitySensor(proximitySensor);
		}

		if (this instanceof GiveMeLightSensor) {
			((GiveMeLightSensor) this).giveMeLightSensor(lightSensor);
		}

		tick();
	}

	private void stepVals() {
		distance = new Random().nextDouble() * 100;
		intensity = new Random().nextDouble();
	}

	public abstract void tick();

	public void doTheThing() {
		didThing = true;
	}

	public boolean needsStep() {
		return !didThing;
	}

	public boolean didThing() {
		return didThing;
	}

	public LightSensor getLightMeter() {
		return lightSensor;
	}

	public ProximitySensor getProximitySensor() {
		return proximitySensor;
	}

	public class ProximitySensor implements ProximitySensorIF {

		@Override
		public double getDistanceInMeters() {
			return distance;
		}
	}

	public class LightSensor implements LightSensorIF {

		@Override
		public double getIntensity() {
			return intensity;
		}

	}

}
