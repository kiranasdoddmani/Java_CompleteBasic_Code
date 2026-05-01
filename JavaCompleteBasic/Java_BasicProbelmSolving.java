// //  Hello Welcome to JavaWorld
package com.pack;
import java.util.*;
public class Java_BasicProbelmSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print if the Number is Odd or Even
		
		System.out.println("Enter The Number:-");
		Scanner ch=new Scanner(System.in);
		int num=ch.nextInt();
		
		if(num/2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}

		// Calculate Income tax Caluculator
		
		System.out.println("Enter Your Income:-");
		Scanner sc=new Scanner(System.in);
		int income=sc.nextInt();
		int tax;
		if(income<=50000) {
			tax=0;
		}
		else if(income >=50000 && income <=100000){
			tax=(int) (income*0.4);
		}
		else {
			tax=(int)(income*0.5);
		}
		System.out.println("Your tax is:"+tax);
		
		
		// Check if Student is Pass or Fail
		
		int marks=sc.nextInt();
		String reportCard=marks>33 ? "Pass" : "Fail";
		System.out.println(reportCard);
		
		
		
		// Calculator
		
		System.out.println("Welcome to Calculator:");
		System.out.println("Enter a Value of A:-");
		int a=sc.nextInt();
		System.out.println("Enter a Value of B:-");
		int b=sc.nextInt();
		System.out.println("Choice a Operator to Calculate:");
		char operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		
		default :
			System.out.println("Wrong Operator");
		}
		
		/*
		  
		 sc.next().charAt(0) --> means When We Enter "Hello" As Input Then it Take First Letter 'H'
		 Hence:-
		 When We Choice Operator Like '+','-','*','/'  it take first charcter
		 
		 */
		
		// Sum of N Natural Number
		
		int sum=0;
		 for(int i=0;i<=10;i++) {
			 sum +=i;
		 }
		 System.out.println("Sum Number is:"+sum);
		 
		 
		 // Print the Reverse of Number
		 for(int i=5;i>=0;i--) {
			 System.out.println("Printing The Reverse Number is:-"+i);
		 }
		 
		 /*
		  
		  Use + to combine (concatenate) strings and values into one output
		  Because println() takes one argument, you combine everything into one expression
		  
		  Comma is used to separate multiple items
		  
		  When we use , operator We use printf();
		  When we use + operator We use println();
		  
		 */
		
		int sum=0;
		 for(int i=0;i<=10;i++) {
			 sum +=i;
		 }
		 System.out.println("Sum Number is:"+sum);
		
		 
		 int a = 10;
		 int b = 20;

		 System.out.printf("a = %d, b = %d%n", a, b);
		 
		 
		 // Reverse the given Number
		 
		 int n=2829;
		 int rev=0;
		 while(n>0) {
			 int lastdigit=n%10;
			  rev=(rev*10)+lastdigit;
			  n=n/10;
		 }
		 System.out.println(rev);
	}

}
