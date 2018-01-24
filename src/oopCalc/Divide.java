package oopCalc;

import java.util.Scanner;

public class Divide {
	
	static void Divide() {
		
		scanner nums = new Scanner (System.in);
	}
	
	double a;
	double b;
	double result;
	
	System.out.println("Enter 1st number");
	a = nums.nextInt ();
	System.out.println("Enter 2nd number");
	b = nums.nextInt ();
	
	if (b=0) {
		
		System.out.println("You can't divide into 0!");	
	}
	
	else result = a / b;
	
	System.out.println("Result is  " + result );
	return;

}


}

}
