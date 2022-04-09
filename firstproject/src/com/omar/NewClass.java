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
			
			// Switch
			
			int xx=2;
			
			switch(xx) { // only byte,short,char,int,String but not accept float or double
		//  switch(5/2) in this case it will ignore the fraction and count the result as 2 
			case 1:
				System.out.println("case #1");
		        break;
			case 2:
				System.out.println("case #2");
			//  break;
			case 3:
				System.out.println("case #3");
			//  break;
			
			default:
				System.out.println("case # default");
			//  break;
						
			}
			
			System.out.println("Enter day number:");
			int day=input1.nextInt();
			
			switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekday");
			    break;
			case 6:
			case 7:	
				System.out.println("Weekend");
			    break;
			
			default:
				System.out.println("incorrect input");
			//  break;
						
			}
			
			
			
			// while loop
// there is count (depend on the counter),Sentinel(depend on EXIT input for ex e like below) ,flag While loops 
			// flag we need to create a TRUE value that will change inside the loop with if condition to FALSE
			char op=' ';
			while (op !='e') 
		 {
			System.out.println("Enter an Operator + - * / %  or e for exit:");
			op=input1.next().charAt(0);
			
			switch(op) {
			
			case '+':
				System.out.println("the result for 5+2="+ (5+2));
			    break;
			case '-':
				System.out.println("the result for 5+2="+ (5-2));
			    break;
			case '*':
				System.out.println("the result for 5+2="+ (5*2));
			    break;
			case '/':
				System.out.println("the result for 5+2="+ (5/2));
			    break;
			case '%':
				System.out.println("the result for 5+2="+ (5%2));
			    break;    
			default:
				if (op=='e') System.out.println("Exit");
				else System.out.println("incorrect input");
			//  break;
						
			}
		   }
			
		 
		// (Do-While Loop)
			
			int ccc=0;
			do {
				System.out.println("Test"+ ccc);
				ccc++;
			}while(ccc<5);
				
			
		// for loop
		// for + ctrl + space will is a shortcut to create for loop	
			
			for (int ii=0;ii<5;ii++)
			{
				System.out.println("for loop:"+ii);
			}
			
			for (int p=0,j=5;p>8 | j>=0;p++,j--) //to loop with dual (or more)condition 
			{
				System.out.println("p="+p+"\t"+"j="+j);
			}
			
			
		// Branching Statements ( Break/Continue /return <--(will explained with function) )
		// There is labeled Break and unlabeled Break (this one caused immediate EXIT from control structure)
		// Continue : skips remaining statements there is also labeled & unlabeled Continue
		/*
		 -in general unlabeled Break will effect what is inside the BLOCKS { } when it is activated
		  
		 - labeled Break will effect what is inside the labeled BLOCKS 
		 omar:{ 
		 ..
		 .. 
		 break omar;
		 ..
		 } 
		 when it is activated
		  
		 */	
		
	    //Ex: about unlabel Break
		for (int row = 1; row <= 10 ; row++) {
			for (int column = 1; column <=5; column++) {
				if(row==5) break;
				System.out.print("* ");
			}
			System.out.println("");
		}	
		
		
		//Ex: about label Break
		stopNow:{
		System.out.println("----------------------------");	
		for (int row = 1; row <= 10 ; row++) {
			for (int column = 1; column <=5; column++) {
				if(row==5) break stopNow;
				System.out.print("* ");
			}
			System.out.println("");
		}
		}
		
		/* or with another version
		System.out.println("----------------------------");	
		
		stopNow:for (int row = 1; row <= 10 ; row++) {
			for (int column = 1; column <=5; column++) {
				if(row==5) break stopNow;
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		  */
		
		//Ex: about unlabeled Continue
		/*
		 
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		  
		  */
		System.out.println("#####################");
		for (int row = 1; row <= 5 ; row++) {
			System.out.println();
			for (int column = 1; column <=10; column++) {
				if(column>row) continue;
				System.out.print("* ");
			}
			
		}
		
		
		//Ex: about labeled Continue
				/*
				 
				 * 
				 * * 
				 * * * 
				 * * * * 
				 * * * * *
				  
				  */
				System.out.println();
				System.out.println("#####################");
				nextRow:for (int row = 1; row <= 5 ; row++) {
					System.out.println();
					for (int column = 1; column <=10; column++) {
						if(column>row) continue nextRow;
						System.out.print("* ");
					}
					System.out.println("line #1");
				}
			
			
		//Method / Function	
		
		System.out.println(sumTwoNumbers(6, 8));	
			
			
			
			
		} // end CB
		
		//Function to calculate sum of two numbers
		static int sumTwoNumbers(int n1,int n2) { //Declare (Prototype) the Function
			int sum= n1+n2;
			return sum;
		}
		
}
