package com.omar;

import java.util.Scanner;

public class ArrayD1 {

	public static void main(String[] args) {
	//  int n[]; n=new int[5];
	//  int []n=new int[5]; all three way correct
		int n[]=new int[5];

		n[0]=15;
		System.out.println(n[0]);
		
		int a[]= {3,6,1,9,0,100};
		System.out.println(a[0]+" "+a[3]);
		System.out.println(n.length);

		/** Default initial value for any cell in the array is:
		 * long,int=0
		 * double,float=0.0
		 * char,String=null
		 * boolean=false
		 */
		
		System.out.println("------------");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("#############");

		
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println("#############");

		// unicode (ASCII) https://www.asciitable.com/
		 char arrOfChar[]= {'H','e','l','l','o',' ',97,98};
		 System.out.println(arrOfChar);
		 
		 System.out.println((char)66);
		 
		 System.out.println("#############");
		 
		 char arr[]=new char[5];
		 Scanner input=new Scanner(System.in);
		 arr=input.nextLine().toCharArray();
		 System.out.println(arr[0]);
	}

}
