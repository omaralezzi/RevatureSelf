package com.omar;

public class NewClass {

		public static void main(String args[]) {
			System.out.print("Hello");  
			//System.out.print(5/0); run time error example
			//System.out.print(5+1/2); logical error example (priority from the developer)  
			System.out.println("1Omar Al-Ezzi");  
			System.out.println("2Omar\nAl-Ezzi");  
			System.out.println("3Omar\n\nAl-Ezzi");  
			System.out.println("4Omar\tAl-Ezzi");  
			System.out.println("5Omar\bAl-Ezzi");  
			System.out.println("6Omar\b\b\nAl-Ezzi");  
			System.out.println("7Omar\n\b\bAl-Ezzi");  
			System.out.println("8Omar \"Al-Ezzi\"");  
			System.out.println("9Omar 'Al-Ezzi'");  
			System.out.println("10Omar \\Al-Ezzi\\");  
					
			System.out.println("A\nd\bJAVA\n"); 
			//syso + ctrl +space
			
			boolean check=true; //Primitive Data Type
			
			char x = 'e'; //16bit unicode //Primitive Data Type
			char y = 'o'; //16bit unicode //Primitive Data Type
			
			String name="Skynet"; // Object/Reference Data Type
			
			float no1=12.5f; //32bit //Primitive Data Type
			double no2=1.5;//64bit //Primitive Data Type
			
			int no3=2;//32bit //Primitive Data Type
			int $=2;//32bit //Primitive Data Type
			byte _no=3; //8bit //Primitive Data Type
			byte no3_1=0b1111111;
			System.out.println("to print the binarry value: " + no3_1);
			
			short no4=4;//16bit //Primitive Data Type
			long no5=49385793484873987L; //64bit //Primitive Data Type
			
			System.out.println(check);
			System.out.println(x + y + x + " just a test");
			System.out.println(x + " just another test");

			System.out.println("I will name it :" + name);
			
			System.out.println(Byte.MAX_VALUE);
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);
			System.out.println(Short.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Long.MAX_VALUE);
			System.out.println(Long.MIN_VALUE);
			
			System.out.println(Float.MAX_VALUE);
			System.out.println(Float.MIN_VALUE);
			System.out.println(Double.MAX_VALUE);
			System.out.println(Double.MIN_VALUE);
			
			//Arithmetic Operations (Basic Operation)
			//+ - * / %
			/*operator precedence 
			https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
			*/ 
			System.out.println((5+6)*2);
			
			System.out.println(15/2);
			System.out.println(15.0/2);

			System.out.println(15/2f);
			
			int nr1=9,nr2=2;
			System.out.println(nr1/nr2);
			System.out.println((float)nr1/nr2); //Widening Primitive Casting/Conversions
			
			int nr3=9;
			float nr4=2;
			System.out.println(nr3/nr4);
			
			float nr5=9,nr6=2;
			System.out.println(nr5/nr6);
			System.out.println((int)nr5/(int)nr6); //narrowing Primitive Casting/Conversions
			System.out.println((int)(nr5/nr6)); //narrowing Primitive Casting/Conversions


			
			
		}
		
}
