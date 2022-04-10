package com.company.constructor;

public class Main2 {

	public static void main(String[] args) {
		Product2 p1= new Product2();
		Product2 p2= new Product2("camera","zoom",99,10,5,"red");
		Product2 p3= new Product2("camera","zoom",99,10,5);

		p1.display();
		p2.display();
		
		// for copy constructor
		Product2 p4=new Product2(p2);
		
		p3.setPrice(80);//to set new price for p3
		
		//Product2 p1= new Product2();
		// if we delete no args constructor this will active an error cause default constructor will not active if any other kind from the constructor already exist
		
		/* Finalizers (garbage collector) is a function that delete the Objects from the (heap) memory at the end of the running the program over JVM
		.
		*/
		
	}

}
