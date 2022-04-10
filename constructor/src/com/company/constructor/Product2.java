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
	private String color;
	
	//public Product2() {} // as a default constructor
	/*  type    Default Value
	 	boolean false
	 	byte	0
	 	short	0
	 	int		0
	 	long	0L
	 	char	\ u000
	 	float	0.0f
	 	double	0.0d
	 	object	null
	  */
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
		System.out.println("constructor:5");
	}
	
	public Product2(String n,String d,float p,int q,float dis,String c) { // constructor Chaining -->when a constructor calls another constructor of the same class 
		this(n,d,p,q,dis);
		this.color=c;
		System.out.println("constructor:6");
	}
	
	public Product2(Product2 obj) { // Copy constructor 
		this.name=obj.name;
		this.description=obj.description;
		this.price=obj.price;
		this.quatity=obj.quatity;
		this.discount=obj.discount;
		this.color=obj.color;
	}
	/* smaller version for the COPY constructor:
	 public Product2(Product2 obj) { // Copy constructor (smaller version)
		this(obj.name,obj.description,obj.price,obj.quantity,obj.discount,obj.color);
	}
	 
	 
	 
	 */
	
	
	public void display() {
		System.out.println("Name="+name);
		System.out.println("description="+description);
		System.out.println("price="+price);
		System.out.println("quatity="+quatity);
		System.out.println("discount="+discount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
