package oopCalc;

import java.util.Scanner;

public class Substract {
	
	static void Substract() {
		scanner nums = new Scanner (System.in);
	}
	
	double a;
	double b;
	double result;
	
	System.out.println("Enter 1st number");
	a = nums.nextInt ();
	System.out.println("Enter 2nd number");
	b = nums.nextInt ();
	
	result = a - b;
	
	System.out.println("Result is  " + result );
	return;

}


}
