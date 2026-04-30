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
