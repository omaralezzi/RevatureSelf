package com.omar;
// import static java.lang.Math.abs; to call only abs method from math
// import static java.lang.Math.*;   to call all methods from math
//Built in Method / Function
// https://www.youtube.com/watch?v=Gxb4oZ5XIkY&list=PLCInYL3l2AajYlZGzU_LVrHdoouf8W6ZN&index=21	
public class BuiltInMethod_Function {
	public static void main(String args[]){
//		System.out.println("abs="+abs(-1.1)); below just another way without import because Math have Built-in Method
//		System.out.println("ceil="+ceil(-1.1));
		System.out.println("abs="+Math.abs(-1.1)); 
		System.out.println("ceil="+Math.ceil(-1.1));		
		System.out.println("floor="+Math.floor(1.9));
		System.out.println("round="+Math.round(1.5));
		System.out.println("round="+Math.round(1.499));
		System.out.println("sqrt="+Math.sqrt(9));
		System.out.println("power="+Math.pow(2,4));
		System.out.println("random="+Math.random());
		
		
		int max,min;
		max=10;
		min=1;
		double randomNumber=(int)(Math.random()*((max-min)+1))+min;
		System.out.println("random="+randomNumber);
	}

}
