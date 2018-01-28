package oopCalc;

import java.util.Scanner;

public class Add extends main {
	
	public static void Add() {

		Scanner scanner = new Scanner (System.in);
		double num = scanner.nextDouble();
		
	}

	double a;
	double b;
	double result;
	
	System.out.println("Enter 1st number");
	a = scanner.nextDouble ();
	System.out.println("Enter 2nd number");
	b = scanner.nextDouble ();
	
	result = a + b;
	
	System.out.println("Result is  " + result );

}
}