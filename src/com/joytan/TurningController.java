package com.joytan;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class TurningController {
	private static int MAX_ANGLE = 45;

	private EV3MediumRegulatedMotor turingMotor;
	private TurningSensor sensor;

	private int speed = 30;
	private int currenyMotorDirection = 0;

	public TurningController() {
		turingMotor = new EV3MediumRegulatedMotor(MotorPort.B);
		sensor = new TurningSensor();
		turingMotor.setSpeed(speed);
	}

	public void turn(int angle) {
		while (angle != sensor.getAngle()) {

			if (angle >= MAX_ANGLE) {
				setTurningMotorDirection(MAX_ANGLE);
			} else {
				setTurningMotorDirection(angle);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void setTurningMotorDirection(int angle) {
		turingMotor.rotate(angle - currenyMotorDirection);
		currenyMotorDirection = angle;
	}
}