package com.omar;

public class arrayD1 {

	public static void main(String[] args) {
	//  int n[]; n=new int[5];
	//  int []n=new int[5]; all three way correct
		int n[]=new int[5];

		n[0]=15;
		System.out.println(n[0]);
		
		int a[]= {3,6,1,9,0};
		System.out.println(a[0]+" "+a[3]);
		System.out.println(n.length);

		/** defult intial value for any cell in the arrry is:
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
		

	}

}
