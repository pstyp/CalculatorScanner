package com.qa.demo;

import java.util.Scanner;

public class CalculatorScanner {

	public static double result;

	

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public static double div(double num1, double num2) {
		
		result = num1/num2;
		return result;

	

		}

	}

