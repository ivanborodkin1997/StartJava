package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int result;
	private int numberOne;
	private int numberTwo;
	private char sign;

	public void partition(String srcExpression) {
		String[] array = srcExpression.split(" ");
		numberOne= Integer.parseInt(array[0]);
		sign = array[1].charAt(0);
		numberTwo = Integer.parseInt(array[2]);
	}

	public int calculate() {
		switch (sign) {
			case '+' :
				result = Math.addExact (numberOne, numberTwo);
				break;
			case '-' :
				result = Math.subtractExact(numberOne, numberTwo);
				break;
			case '*' :
				result = Math.multiplyExact(numberOne, numberTwo);
				break;
			case '/' :
				result = Math.floorDiv (numberOne, numberTwo);
				break;
			case '^' :
				result = (int) Math.pow (numberOne, numberTwo);
				break;   	
			case '%':
				result = (numberOne % numberTwo);
				break;
		}
		return result;
	}
	
}