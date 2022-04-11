package com.mycompany.javaoop2;

public class Student {
	
	int no;
	static int count =1; // Static Variable
	String name;
	static String college="IT";
	
	Student (String name){
		this.no=count;
		this.name=name;
		count++;
	}
	
	public static int cube(int x) { //Static Methods
		return x*x*x;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

}
