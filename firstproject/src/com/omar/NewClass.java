package com.omar;

import java.util.Scanner;

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

			// ++ --
		    //  x++; Postfix /pPost increment
			//  ++x; Prefix /pre increment
			int n=1;
			System.out.println("Pre n="+ ++n);
			
			System.out.println("Post n="+ n++);
			System.out.println("Post n="+ n++);
			
			int d=1;
			System.out.println("d="+ d++ + " "+ ++d +" "+d++);
			System.out.println("final d="+d);
			
			int g=d++;
			System.out.println("g="+g);
			System.out.println("after d="+d);
			
			int r= ++d + d++;
			System.out.println("r="+r);
			System.out.println("final again d="+d);

			int m= (++d*2 + d++%2)/2;
			System.out.println("m="+m);
			System.out.println("final again complex d="+d);
			
			// The Assignment Operators
			//= += -= *= /= %= &= ^= |= <<= >>= >>>=
			int k=5;
			k= k+10; //k+=10;
			
			//Scanner
			/*
			 Primitive:
			 nextBoolean()
			 nextbyte()
			 nextShort()
			 nextInt()
			 nextLong()
			 nextFloat()
			 nextDouble()
			 
			 non Primitive:
			 next()
			 nextLine()
			 */
			
			Scanner input1=new Scanner(System.in);
			System.out.println("Enter number:");
			int ff=input1.nextInt();
			System.out.println("Number= "+ff);
			
			float nn1,nn2;
			// not need it again already done Scanner input1=new Scanner(System.in);
			System.out.println("Enter number 1:");
			nn1=input1.nextFloat();
			System.out.println("Enter number 2:");
			nn2=input1.nextFloat();
			System.out.println("Sum Number 1 and 2= "+ (nn1+nn2));
			System.out.println("Num1 = "+nn1+" "+"num2 = "+nn2);
			System.out.printf("Num1 = %.2f num2 = %f%n%n%n",nn1,nn2);
			/* regarding %symbol
			 d : [byte, short, int, long]
			 f :[float,double]
			 cC:char Capital C will uppercase the letter
 			 sS:String Capital S will uppercase all the letters in the String
 			 n : newline
 			  */
			
			System.out.println("Enter a String without space:");
			String s1=input1.next();
			System.out.printf("the value of the String is %s and the uppercase is %S%n",s1,s1);
			
			/*nextLine depend on the version
			System.out.println("Enter a String with space:");
			String s2=input1.nextLine();
			System.out.printf(" is %s",s2);
			*/
			System.out.println("Enter a char:");
			char c1=input1.next().charAt(0);
			System.out.printf("the value of the String is %c and the uppercase is %C%n",c1,c1);
			
			// if - if else -if else if 
			// == != < <= > >=
			
			System.out.println("even odd checker..please Enter a number: ");
			long oddOrEven=input1.nextLong();
			if(oddOrEven<0)System.out.println("The Number is less than 0");
			else if (oddOrEven%2==0) System.out.println("The Number is Even");
			else System.out.println("The Number is Odd");
			
			//Ternary Operator
			//?:
			int v=4;
			int z= v==1? 2:5;
			System.out.println("z="+z);
			
			// Instanceof Method used only with non Primitive 
			
			System.out.println(s1 instanceof String); //true or false
			System.out.println(input1 instanceof Scanner); //true or false
			
		}
		
}
