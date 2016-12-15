package com.joytan;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.robotics.SampleProvider;

public class GyroSensorReader 
{
	static EV3GyroSensor gyroSensor = new EV3GyroSensor(SensorPort.S1);
	
	private SampleProvider gyroProvider;
	private float[] gyroAngle = new float[1];
	
	public GyroSensorReader() 
	{
		gyroSensor.setCurrentMode("Angle");
		gyroProvider = gyroSensor.getAngleMode();
	}
	
	protected int readAngle()
	{		 
		gyroProvider.fetchSample(gyroAngle, 0);
		return (int) gyroAngle[0];
	}
	
	void reset(){
		gyroSensor.reset();
	}
}
