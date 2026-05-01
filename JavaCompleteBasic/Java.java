
 //  Hello Welcome to JavaWorld !!!
/********************************************************************************************************************
package com.pack;
// Operator and Expression
 
public class JavaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7 + 8  (Where (7) operator and (+) sign is Operand )
		
            /* Arithematic Operator Doesnot Work with Boolean */
		/* Logical Operator and Comparrssion Operator Work with Boolean*/
		/* Modulus(%) does not work with Floats*/
		
		
	//  Types of Operator 
		
//	     1. Arithematic Operator
//	     (+,-,*,/,%)
	     int a=4;
	     int b=a+6;
	     System.out.println(b);
	    
//       2.Assingment Operatoe
//	     (+=,-=,*=,/=)    
	     int c=4;
	     c+=6;
	     System.out.println(c);
	     
//       3.Comparssion Operator
//	     (==,<=,>=,<,>)
	     
//       4.Logical Operator
//	     (&&(and),||(or),!(not))
	     
	     System.out.println(64>=5 && 64 >=8);
	     System.out.println(64>5 || 64 <8);
	     System.out.println(!(true));
	     
//       5. BitWise Operator
//	     ( & (bit and) , | (bit or))
	     
	     
	/****************************************************************************************************/     
	     
       // Associativity Of Operator	 
	     /*
	      Operator precedence determines the order in which the operators in an expression are evaluated.For eg –int x = 3 * 4 - 1;In the above example,
	      the value of x will be 11,not 9.
	      This happens because the precedence of* operator is higher than-operator.That is why the expression is evaluated as (3 * 4) - 1 and not 3 * (4 - 1)
	      */
	     
	     // Assocaiativity Means Precedence of Operator 
	     
//	     (Higher OrderWise Of Precedency Operator are ( (),*,/,+,- )
/*   Some of opertor Which have same level of precedence like (*,/)(+,-) have Same precedence if its comes in problem then We calculate the probelm 
            from left to right	     */
	     
	     int d=6*5-34/2;   // ( Precedence Calculated From Left to Right)
	     /*
	      + /  --> left to right
	      + -  --> left to right
	      + +  --> right to right
	      */
	     
	     //  Types Of Expression And Increment and Decrement Operator 
	     
	/*      Increment Operator 
	       1. Post Increment
	       --> First Assign a value then Increment of value takeplace
	       
	       int a=10;
	       System.out.println(a++);
	       o/p:10
	       System.out.println(a);
	       o/p:11
	       
	       2. Pre Increment
	       --> First Increment the value then Assign value
	       
	        int a11=10;
	       System.out.println(++a11);
	        o/p:11
	        System.out.pritnln(a11);
	         o/p:11
	       */
	     
	     /*      Decrement Operator 
	       1. Post Decrement
	       --> First Assign a value then Increment of value takeplace
	       
	        int a=10;
	       System.out.println(a--);
	       o/p:10
	       System.out.println(a);
	       o/p:9
	       
	       o/p:11
	       2. Pre Decrement
	       --> First Increment the value then Assign value
	       
	        int a=10;
	       System.out.println(--a);
	       o/p:9
	       System.out.println(a);
	       o/p:9
	       
	       
	       // For character Increment 
	        
	        char ch='a';
	        System.out.println(ch++);
	        System.out.println(ch);
	       
	       */
	     
	  
	     
	}

}
/*****************************************************************************************************************************
package com.pack;

public class JavaBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  
		 Java Is an Portabel Language
		  In Java They Are Two Stage:-
		  1. Completion Stage
		  2.Excecution Stage 
		 
		 */
		/*
		 
		  How Coding is Work :-
		  Java Development Kit + Java Development Tools
		  (
		   Java RunTime Enviorment :-
		   (
		   Java Virtual Machine + Libraries
		   )
		   )
		   
		 */
		
		/*
		    For Input taken
		  import java.util.Scanner;
		  System.out.println("Enter Your Name:");
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();      --> For Numbers
		  String str=sc.next();
		  String str=sc.nextLine();  --> for Entire Sentence Print
		 */
		
	/***********************************************************************************************/	
		
//       Varibales and DataTypes	
		
		/*
		 DataTypes Like  int,Char,String,float,double,Boolean
		 */
		
		String ColorNam="Blue";
//		datatype varible=variable_value;
		
		// long > int -->  Means Here Long contain (8 bytes) and int contain (4 bytes) so we Store 4 bits in 8 bits but we can not store 8 bit in 4 bit 
		
				//  Type Conversion
				int a=25;
				long b=a;
				System.out.println(b);
				
				//  Here  We Can not store 8 bit in 4 bit 
				long a1=25;
				int b1=(int)a;    // --> Here We Write (int) this is type casting 
				System.out.println(b1);
				
				/*
				 Type casting : Means We Can not Convert Directly Convert large Byte in to Small Byte So We use Type Casting
				 Type casting is also called as Narrow Casting or explicit Casting
				 */
				
				char ch='a';
				int number=ch;
				System.out.println(number);
				
			/*  
			  Here is Possible Bcz Int has More Number of Byte Than The char So We Dont need Any Type casting
			  */	
				 
				
			//  Type Promotion and Expression
				
				/*   
				 State:1  Java Automatically Convert large byte in to small byte
				 i.e Java Automatically Promotes each byte,short or char operand to int when Evaluting an expression
				 
				 ex:-
				  */
				
				int a11=25;
				long b11=a;
				System.out.println(b11);
				
				
				/*
				 State 2: if one Operand is long,float or double the whole expression is promoted to long float,double respectively
				 
				 ex:-
				  */
				long a21=25;
				int b21=(int)a;    // --> Here We Write (int) this is type casting 
				System.out.println(b21);
				
				
		
		// Type Casting
//		Conversion Happens When:
//	a.  Type Compatible -->  destinationType > SourceType		
		
//	byte>short >int>float>long>double	 
		
		int a=25;
		long b=a;
		System.out.println(b);
		
		/***************************************************************************************/
		
		/* Precedence --> if Two Symbols Have Same Precedence The it Called it as Associativity
		Which can be Calculated from left to right
		But 
		if Same operators Occur then it will calculated from right to right
		
		
		/*********************************************************************************/

		// Introduction to Strings
		/*
		 String is an Class But We Consider as a DataType 
		 String is an Sequence of Character
		 
		 String are Immutable means We can not Changed
		 
		 Different way to print :-
		 
		 System.out.println() --> ln for new line
		 System.out.print()  --> No new line
		 System.out.printf() --> for float Numbers
		 
		 %d --> for double , int
		 %s --> for string
		 %c --> for character
		 %f --> for float
		 ; --> semicolon  (as terminator)
		 
		 sc.next() --> for Word Print
		 sc.nextLine() --> for complete Sentence Print
		 */
	//  Methods of String
		
	//	ex:- String name="Kirana";
		
		String name="Kirana";
		
//    1. name.length()	
		System.out.println(name.length());
		
//    2. name.toLowerCase()  and name.toUpperCase()
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
//    3. name.trim  --> trim is a method which is used to remove all leading and trailing space from original string
		
//		" (leading_space) kirana (trailing_space) "
		
		String name1="     Kirana      ";
		System.out.println(name1.trim());
		
		
//		4.name.SubString(start_indx,end_indx)             K i r a n a
		System.out.println(name.substring(2, 5));  //     0 1 2 3 4 5      o/p:ran
		
//      5.name.replace(oldchar, newchar)
		System.out.println(name.replace("Ki", "Va"));
		
//      6.name.StartsWith And EndsWith   --> (Boolean)		
		System.out.println(name.startsWith("Ki"));
		System.out.println(name.endsWith("na"));
		
//      7.name.charAt()  --> charAt Which Print The indexValue
		System.out.println(name.charAt(5));
		
//      8.name indexOf()  --> indexOf Which Print Index of Value	
		System.out.println(name.indexOf("ra"));
		
		String Nam="Harryrry";
		System.out.println(Nam.indexOf("rry",4));
		
		// 4 Becoz it will Start From There   Hence O/p:5
		
//      9.name.lastindexof()  --> return lastindexofString
		System.out.println(Nam.lastIndexOf("rry"));
		System.out.println(Nam.lastIndexOf("rry",4));
		
//      10.name.equals --> it will used to Compare Two String  But it is K senstive 	
		String Nm="Kirana";
		System.out.println(Nm.equals("Kirana"));  // --> it will show True 
		System.out.println(Nm.equals("KIrana"));  // --> it will show false Bcz of K Senstive
		
//      11.name.equalIgnoreCase --> In this method it ignore k senstive 
		String N="KiRanA";
		System.out.println(N.equalsIgnoreCase("Kirana"));
		
		
		
		/*******************************************************************************************************/
	
		
   //  Escape Sequence Character
//		Escape Sequence Character Means Which Consists of More Than One Character But it acts as Single Character Which Can be Written Inside the String
		
		/*
		\n  --> NewLine
		\t --> tabLine
		\" --> it will work like DoubleQoute
		System.out.println(" I am Escape Sequence \" doubleQoute");
		\\ --> BlackSlash 
		 */
		
		System.out.println(" I am Escape Sequence \"doubleQoute");
		
	}

}

/*********************************************************************************************************************************

package com.pack;
import java.util.*;
public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 		Conditional_Statements :-
//        1.if-else Statements
//		  2.Switch Statemets
		 
		/*
		 else condtional is an optional
		 
		 Syntax:-
		 
		 if(cond) 
		 {
		 System.out.println("Statement");
		 }
		 else
		 {
		 System.out.println("Statement");
		 }
		 
		 */
		
		// if - else Conditions
		
		System.out.println("Enter Your Age:-");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Not Adult");
		}
		
        //  Relational Operator
	   // (==,>=,<=,<,>,!=)	
		
		// Boolean varible
		int ag=18;
		boolean cond=(age==18);
		if(cond) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Not Adult");
		}
		
		
		//  Logiacl Operator
//         (&&,||,!)	
		
		// else if ladder
		/*
		 if(cond)
		 {
		 System.out.println("Statement");
		 }
		 else if(cond)
		 {
		 System.out.println("Statement");
		 }
		 else if(cond)
		 {
		 System.out.println("Statement");
		 }
		 else	
		 {
		 System.out.println("Statement");
		 }
		  */
		
		
		// Switch Statemnets
		
		/*
		 switch(cond){
		 case 1:
		 System.out.println("Statement");
		 break;
		
		 case 2:
		 System.out.println("Statement");
		 break;
		 
		 case 3:
		 System.out.println("Statement");
		 break;
		
		 case 4:
		 System.out.println("Statement");
		 break;
		
		 default:
		  System.out.println("Statement");
		  }
		  */
		
		int num=18;
		 switch(num){
		 case 18:
		 System.out.println("is Adult");
		 break;
		
		 case 20:
		 System.out.println("is Not Adult");
		 break;
		 
		 case 30:
		 System.out.println("Job");
		 break;
		
		 case 40:
		 System.out.println("Semi Experience");
		 break;
		
		 default:
		  System.out.println("Experienced");
		  }
		 
	//   For Character
		 char var='A';
		 switch(var){
		 case 'A':
		 System.out.println("Hello ...");
		 break;
		
		 case 'K':
		 System.out.println("Hi ...");
		 break;
		 
		 case 'C':
		 System.out.println(" Good Job");
		 break;
		
		 case 'V':
		 System.out.println("I Setteled");
		 break;
		
		 default:
		  System.out.println("I Will Try MyBest Until My Last Brith");
		  }
		 
		 
	//  Break and Continue Statements
		 
		 /*
		  Break Statement:- This statement which is used for to exit from the loop
		  Continue Statement:- This statement is used for to skip the iteration
		  */
		 
		 
		 // Loops
		 /*
		  
		  1. While loop
		  2. do While loop
		  3. for loop
		  
		  difference between while and do-while loop
		  
		  while-loop:- first check the cond then execute the condn
		  do-while :- first execute the check the cond
		  
		   while(cond) {
			 System.out.println("Statement");
		 }
		 
		  do{
			 System.out.println("Statement");
		 }
		 while(cond);        --> Semicolon is more Important
		   */
		  
		// 1. While-loop
		 int i=0;
		 while(i>5) {
			 System.out.println("Hello My Slef Kirana S Doddamani");
			 i++;
		 }
		 
		 
		// 2. do-loop
				 int i1=0;
				 do{
					 System.out.println("Hello My Slef Kirana S Doddamani");
					 i++;
				 }while(i1>5) ;
		
		// 3. for-loop 
				 
		//		 for(intilization;condition;updation);
				 
				 for(int j=0;j<5;j++) {
					 System.out.println(i+"Hello My Slef Kirana S Doddmani i am Java Developer");
				 }  
		 
				 
		//  Break and Continue Statements
				 
				 for(int k=0;k<=5;k++) {
					 System.out.println(k+"Hi EveryOne");
					 if(k==3) {
						 System.out.println("I will take SomeBreak");
						 break;  // --> exit from the loop when k==3
					 }
				 }
				 
				 
				 for(int k=0;k<=5;k++) {
					 System.out.println(k+"Hi EveryOne");
					 if(k==3) {
						 System.out.println("I will take SomeBreak but Conversion Was Not Stop");
						 continue;    //  --> skip the iteration When k==3 then it will excute further
					 }
				 }
				 
	}

}
