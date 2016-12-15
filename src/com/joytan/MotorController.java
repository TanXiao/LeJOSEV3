package com.joytan;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class MotorController {
	static EV3LargeRegulatedMotor mMainMotor = new EV3LargeRegulatedMotor(
			MotorPort.A);
	static EV3MediumRegulatedMotor steeringWheel = new EV3MediumRegulatedMotor(MotorPort.B);
	static GyroSensorReader angleReader = new GyroSensorReader();
	
	//static final int 
	
	void setSpeed(int degreePerSec){
		mMainMotor.setSpeed(degreePerSec);
	}
	
	void forward() {
		mMainMotor.forward();
	}
	
	void backward() {
		mMainMotor.backward();
	}
	
	void stop() {
		mMainMotor.stop();
	}
	
	protected void turn(int degree) throws InterruptedException {	
		int turningSpeed;
		int direction = (degree > 0) ? 1 : -1;
		angleReader.reset();
	
		while (Math.abs(degree) < Math.abs(angleReader.readAngle())) {
			if (Math.abs(degree - angleReader.readAngle()) > 45){
				turningSpeed = 30;
			}else {
				turningSpeed = 15;
			}
			steeringWheel.setSpeed(turningSpeed);
			}
		
		
		for (int i = 0; i < degree; i++) {
			steeringWheel.rotate(direction);
			Thread.sleep(10);
		}
		
	}
	
}