package com.omar;
// Method Overloading depend on the parameters numbers and there type to create the sign
public class MethodOverloading {
	static int sum (int n1,int n2) {
		return n1+n2;
	}
	static float sum (float n1,float n2) {
		return n1+n2;
	}
	static float sum (int n1,float n2) {
		return n1+n2;
	}
	static float sum (float n1,float n2,float n3) {
		return n1+n2+n3;
	}
	public static void main(String[] args) {
		System.out.println("sum="+sum(3,7));
		
	}

}
