package com.company.constructor;

public class Product {
	/* Rules for creating Java constructor:
	 1.constructor name must be the same as its class name
	 2. A constructor must have no explicit return type
	 3. A Java constructor cannot be abstract, static final, and synchronized
	 */
	private String name;
	private String description;
	private float price;
	private int quatity;
	private float discount;
	
	public Product() { // the first Rule 
		System.out.println("Constactor is called!!");
	}
}
