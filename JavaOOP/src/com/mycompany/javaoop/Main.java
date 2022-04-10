package com.mycompany.javaoop;

public class Main {

	public static void main(String[] args) {
		Car obj;
		obj= new Car();
		// or like --> Car obj = new Car();
		obj.name="Tesla";
		obj.maxSpeed=210;
		obj.model=2022;
		System.out.println(obj.name);
		System.out.println(obj.maxSpeed);
		System.out.println(obj.model);
		
		Car objCar2=new Car();
		objCar2.name="BMW";
		objCar2.maxSpeed=220;
		objCar2.model=2021;
		System.out.println(objCar2.name);
		System.out.println(objCar2.maxSpeed);
		System.out.println(objCar2.model);
		
		Car objCar3=new Car();
		System.out.println(objCar3.name); //null as an initial value
		
		Car objCar4=new Car();
		objCar4.setName("KIA");
		objCar4.setModel(2016);
		System.out.println(objCar4.getName());
		System.out.println(objCar4.getModel());
		
		Car objCar5=new Car();
		objCar5.setName("Honda");
		objCar5.setModel(2010); //model check
		System.out.println(objCar5.getName());
		System.out.println(objCar5.getModel());

	}

}
