package com.example.myfirstapp;

import java.util.Hashtable;

public class Route {
	private String formalname;
	private Hashtable<String, Stop> stops;
	
	public Route (String name, Hashtable arrets) {
		formalname = name;
		stops = arrets;
	}
	
	public void addStop(String name, Stop stop) {
		stops.put(name, stop);
	}
	
}
