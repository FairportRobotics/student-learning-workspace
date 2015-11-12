package edu.fairport.robotics.master;

import java.util.ArrayList;
import java.util.Set;

import org.reflections.Reflections;

import edu.fairport.robotics.interfaces.AbstractRobot;

public class Master {

	public static final double MIN_DISTANCE = 2.94;
	public static final double MAX_INTENSITY = 0.822;

	public static void main(String[] args) throws Exception {

		// Nice reflection handler.
		Reflections reflections = new Reflections("edu.fairport.robotics");

		// Deal with Each implementation now.
		Set<Class<? extends AbstractRobot>> abstractRobots = reflections.getSubTypesOf(AbstractRobot.class);

		// Manage Instances
		ArrayList<AbstractRobot> robotSet = new ArrayList<AbstractRobot>();
		for (Class<? extends AbstractRobot> abstractRobot : abstractRobots) {
			robotSet.add(abstractRobot.newInstance());
		}
		
		if (robotSet.isEmpty()) {
			System.err.println("No Robots Found.");
			return;
		}

		// We'll count down robots that still need steps
		int aliveRobots = robotSet.size();
		while (aliveRobots > 0) {
			for (AbstractRobot r : robotSet) {

				if (r.needsStep()) {
					r.step();
					// Should the trigger have been pulled?
					double dist = r.getProximitySensor().getDistanceInMeters();
					double intensity = r.getLightMeter().getIntensity();
					if (dist < MIN_DISTANCE && intensity > MAX_INTENSITY) {
						// Did it miss the chance?
						if (!r.didThing()) {
							System.err.println("[" + r.getClass().getSimpleName() + "] Robot Crashed. Parameters were correct [" + dist + "," + intensity + "], but it didn't do the thing.");
							r.doTheThing();
						} else {
							System.err.println("[" + r.getClass().getSimpleName() + "] Excellent!!! Parameters were correct [" + dist + "," + intensity + "] and the robot did the thing at the right time.");
						}
						
						// that robot is done.
						aliveRobots--;
					} else {
						// case where robot did it, but didn't need to, but it's done.
						if (r.didThing()) {
							System.err.println("[" + r.getClass().getSimpleName() + "] Robot Crashed. Parameters were incorrect [" + dist + "," + intensity + "], but it did the thing.");
							aliveRobots--;
						}
					}
				}
			}

			System.err.println("Running Through Heartbeats Again.");
		}
	}
}
