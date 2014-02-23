package com.example.myfirstapp;

public class Stop {

	private GPSCoords coords;
	private String formalname;
	private int time;
	
	public Stop(GPSCoords latlon, String name, int mins) {
		coords = latlon;
		formalname = name;
		time = mins;
	}
	
	public void updateTime(int mins) {
		time = mins;
	}
}
