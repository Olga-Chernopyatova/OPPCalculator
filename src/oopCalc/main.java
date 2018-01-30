package oopCalc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner (System.in);
	    System.out.println("Choose the operation");
		System.out.println("1 Add 2 Substract 3 Multiply 4 Divide");
		
		int input = scanner.nextInt();
		
		switch (input) {
		case 1: Add();
		case 2: Substract();
		case 3: Multiply();
		case 4: Divide();
			
		 class Add extends main {
			
			 private void Add() {

				Scanner scanner = new Scanner (System.in);
				double num = scanner.nextDouble();
			}

			double a;
			double b;
			double result;

			System.out.println("Enter 1st number");
			a = scanner.nextDouble ();
			System.out.println("Enter 2nd number");
			b = scanner.nextDouble ();{
			
			result = a + b;
			
			System.out.println("Result is  " + result );
			}}
			class Divide extends main {
				
				public void Divide() {
					
					Scanner scanner = new Scanner (System.in);
					double num = Scanner.nextDouble();
				}

				double a;
				double b;
				double result; 
				{
				
				try {
				
				System.out.println("Enter 1st number");
				a = Scanner.nextDouble ();
				System.out.println("Enter 2nd number");
				b = Scanner.nextDouble ();
				} 
				catch (b=0) {
					System.out.println("You can't divide into 0!");	
				}
				}
				{
				
				result = a / b;
				
				System.out.println("Result is  " + result );
				return;
		
				
				public class Substract extends main {
					
					 static void Substract() {
						Scanner scanner = new Scanner (System.in);
						double num = scanner.nextDouble();
					}
					
					double a;
					double b;
					double result;
					
					System.out.println("Enter 1st number");
					a = scanner.nextDouble ();
					System.out.println("Enter 2nd number");
					b = scanner.nextDouble ();{
					
					result = a - b;
					
					System.out.println("Result is  " + result );
					return;}
		
		}

 {
		
	}}

	private static void Divide() {
		// TODO Auto-generated method stub
		
	}

	private static void Add() {
		// TODO Auto-generated method stub
		
	}

	private static void Multiply() {

	}

	private static void Substract() {

	}

	 {
		
	}

	public static double add(double a, double b) {
		return 0;
	}

	public static double multiply(double a, double b) {
		return 0;
	}

	public static double substract(double a, double b) {
		return 0;
	}

	public static double divide(double a, double b) {
		return 0;
	}


	}