package oopCalc;

import java.util.Scanner;

public class Divide extends main {
	
	public static void Divide() {
		
		Scanner scanner = new Scanner (System.in);
		double num = Scanner.nextDouble();
	}
	
	double a;
	double b;
	double result;
	
	System.out.println("Enter 1st number");
	a = scanner.nextDouble ();
	System.out.println("Enter 2nd number");
	b = scanner.nextDouble ();
	
	if (b=0) {
		
		System.out.println("You can't divide into 0!");	
	}
	
	else result = a / b;
	
	System.out.println("Result is  " + result );
	return;

}


}


