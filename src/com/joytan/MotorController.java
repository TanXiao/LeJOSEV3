package com.joytan;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class MotorController {
	private EV3LargeRegulatedMotor mMainMotor = new EV3LargeRegulatedMotor(
			MotorPort.A);
	
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
	
		
}