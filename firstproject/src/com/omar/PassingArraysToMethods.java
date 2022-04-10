package com.omar;

public class PassingArraysToMethods {
	
	static void print(int x[]) {
		 for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	static int []getArray(){
		int ar[]= {55,66,77};
		return ar;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4}; 
		print(arr);
		
		// Anonymous array
		print(new int []{88,99,100});
		
		// return Array
		int arr2[]=getArray();
		System.out.println(arr2); // print the address
		System.out.println(arr2[0]);
		
		// Attention:
		//call by value like for variables (take effect only inside the scope)
		//VS 
		//call by reference like in array case(take effect any where when changed)

	}

}
