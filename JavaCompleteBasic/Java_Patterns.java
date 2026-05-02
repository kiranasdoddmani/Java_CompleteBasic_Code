 // Hello Java World
package com.pack;

public class Java_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Print Star Pattern
		/*
		  
		 *
		 **
		 ***
		 ****
		 
		  */
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 2. Inverted Star Pattern
		/*
		 
		  ****
		  ***
		  **
		  *
		  
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 3. Character Print
		/*
		 
		 A
		 B C
		 D E F
		 G H I J
		 
		 */
		
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		// 4. Half Pyramid Pattern
		/*
		 
		 1
		 1 2 
		 1 2 3
		 1 2 3 4
		 */
		 
		for(int i=1;i<=n;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
	}

}
