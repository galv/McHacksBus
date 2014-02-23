package com.example.myfirstapp;

import java.util.Hashtable;

public class Agency {
	
	private String agency_name;
	private float agency_rate;
	private Hashtable<String, Route> routes;
	
	public Agency (String name, float rate) {
		agency_name = name;
		agency_rate = rate;
		routes = new Hashtable<String, Route>();
	}
	
	public void addRoute(String name, Route route) {
		routes.put(name, route);
	}
}