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
			
		}
		}

	private static void Divide() {
		
	}

	private static void Multiply() {

	}

	private static void Substract() {

	}

	private static void Add() {
		
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