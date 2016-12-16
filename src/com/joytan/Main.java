package com.joytan;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;

public class Main {

//	static EV3LargeRegulatedMotor LEFT_MOTOR = new EV3LargeRegulatedMotor(
//			MotorPort.A);

	public static void main(String[] args) throws Exception {

		EV3 ev3brick = (EV3) BrickFinder.getLocal();
		Keys buttons = ev3brick.getKeys();
		
		MotorController motorController = new MotorController();
		TurningController turningController = new TurningController();
	

		LCD.drawString("Ready", 0, 0);
		buttons.waitForAnyPress();
		motorController.forward();
		Thread.sleep(1000);
		turningController.turn(90);
		
		
		
		
		buttons.waitForAnyPress();
	}

	
}