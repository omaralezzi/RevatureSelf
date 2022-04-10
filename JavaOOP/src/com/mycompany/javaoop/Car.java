package com.mycompany.javaoop;

public class Car {
	//Attribute,Data,Properties
    private String name; // Data Hiding technique
    private int maxSpeed;
    private float price;
    private int model;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		if(model>= 2015)
			this.model = model;
		else
			System.out.println("Wrong Model need to be more than 2015");
	}

}
