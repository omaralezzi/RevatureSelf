package com.company.constructor;

public class Product2 {
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
	
	public Product2() { // no args constructor
		this.name="No name";
		this.description="No description";
		this.price=0.0f;
		this.quatity=0;
		this.discount=0;
	}
	
	public Product2(String n,String d,float p,int q,float dis ) { // Parameterized constructor
		this.name=n;
		this.description=d;
		this.price=p;
		this.quatity=q;
		this.discount=dis;
	}
	
	public void display() {
		System.out.println("Name="+name);
		System.out.println("description="+description);
		System.out.println("price="+price);
		System.out.println("quatity="+quatity);
		System.out.println("discount="+discount);
	}
}
