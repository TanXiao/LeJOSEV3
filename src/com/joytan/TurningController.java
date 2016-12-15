/**
 * 
 */
package com.joytan;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

/**
 * @author Xiao
 *
 */
public class TurningController 
{
	static EV3MediumRegulatedMotor steeringWheel = new EV3MediumRegulatedMotor(MotorPort.B);
	static GyroSensorReader angleReader = new GyroSensorReader();
	
	static private int MAX_ANGLE = 45;
	static private int TURNING_SPEED = 30;
	
	private int currentSteeringWheelDirection = 0;
	
	protected void turn(int degree) throws InterruptedException {	
		
		int direction = (degree > 0) ? 1 : -1;
		angleReader.reset();
	
		while (Math.abs(degree) < Math.abs(angleReader.readAngle())) {
			
		}
		
		
		
		
	}

	private void setDirection(int angleToDest) {
		steeringWheel.rotate(angleToDest - currentSteeringWheelDirection);
		currentSteeringWheelDirection = angleToDest;	
	}
	
}
