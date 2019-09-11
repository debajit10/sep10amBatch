package org.firstday;

import java.util.Scanner;

public class Fibonacci {

		public static void main(String[] args) {
		int a=0,b=1;
		int c;
		
//to scan the value from runtime
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci series is"); 		//additional text
		System.out.println(a);  						//to start from 0
		for (int i=1; i<=n; i++) {
			c = a+b;
			System.out.println(c);
			
//swapping the value
			a=b;
			b=c;
			
		}
	}
}
