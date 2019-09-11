package org.firstday;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {

		int total = 0;
		
//to scan the value from runtime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println(i);
			total = total + i;
		}
		System.out.println("Sum of even number is :" +total);
	}
}
