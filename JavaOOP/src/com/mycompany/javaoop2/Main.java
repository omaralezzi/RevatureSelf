package com.mycompany.javaoop2;

public class Main {

	public static void main(String[] args) {
		Student studen1=new Student("Ali");
		Student studen2=new Student("Mo");
		Student studen3=new Student("Omar");
		
		System.out.println(studen1.toString());
		System.out.println(studen2.toString());
		System.out.println(studen3.toString());
		
		System.out.println(Student.cube(3));

	}

}
