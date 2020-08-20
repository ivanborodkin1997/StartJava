package com.startjava.lesson_2_3.calculator;

public class Calculator {
	public int calculate(int firstNumber, int secondNumber, char sign) {
		int result = 0;
		switch (sign) {
			case '+' : 
				result = (firstNumber + secondNumber);
				break;
			case '-' : 
				result = (firstNumber - secondNumber);
				break;
			case '*' : 
				result = (firstNumber * secondNumber);
				break;
			case '/' : 
				result = (firstNumber / secondNumber);
				break;
			case '^' : 
				int numberInDegree = 1;
				for(int i = 0; i < secondNumber; i++) {
					numberInDegree *= firstNumber;
				}
				result = numberInDegree; 
				break;   	
			case '%': 
				result = (firstNumber % secondNumber);
				break;
		}
		return result;
	}
	
}