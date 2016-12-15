package com.joytan;


import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Main {
	
	
	
	static EV3 ev3brick = (EV3) BrickFinder.getLocal();
	static Keys buttons = ev3brick.getKeys();
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		int mRow = 0;
		LCD.drawString("Ready!", 0, mRow++);
	
//		angleReader.reset();
//
//		LCD.drawString(String.valueOf(angleReader.readAngle()), 0, mRow++);
//		buttons.waitForAnyPress();
//		LCD.drawString(String.valueOf(angleReader.readAngle()), 0, mRow++);
//		buttons.waitForAnyPress();
//		
//
//		
//
//		
//		
//		while (buttons.getButtons() != Keys.ID_ESCAPE) {
//			switch (buttons.getButtons()) {
//			case Keys.ID_UP:
//				LCD.drawString("FORWARD", 0, mRow++);
//				break;
//			case Keys.ID_DOWN:
//				mMainMotor.backward();
//				LCD.drawString("BACKWARD", 0, mRow++);
//				break;
//			case Keys.ID_LEFT:
//				//steeringWheel.rotate(5);
//				slowlyRotate(10);
//				LCD.drawString("turn left", 0, mRow++);
//				break;
//			case Keys.ID_RIGHT:
//				//steeringWheel.rotate(-5);
//				slowlyRotate(-10);
//				LCD.drawString("turn right", 0, mRow++);
//				break;
//			case Keys.ID_ENTER:
//				mMainMotor.stop();
//				LCD.drawString("STOP", 0, mRow++);
//			default:
//				break;
//			}
//		}		
//		
//		mMainMotor.stop();
		LCD.drawString("STOP", 0, mRow++);
		
		// exit program after any button pressed
		buttons.waitForAnyPress();
	}
	
	
	
	
}