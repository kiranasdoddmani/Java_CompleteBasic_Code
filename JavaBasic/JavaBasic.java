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
