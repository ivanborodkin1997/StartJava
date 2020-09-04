package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int numberOne;
	private int numberTwo;
	private char sign;

	public void expression(String[] splitExpression ){
		numberOne = Integer.parseInt(splitExpression[0]);
		sign = splitExpression[1].charAt(0);
		numberTwo = Integer.parseInt(splitExpression[2]);
	}

	public int  calculate(String[] splitExpression){
		expression(splitExpression);
		switch (sign) {
			case '+' :
				return Math.addExact(numberOne, numberTwo);
			case '-' :
				return Math.subtractExact(numberOne, numberTwo);
			case '*' :
				return Math.multiplyExact(numberOne, numberTwo);
			case '/' :
				return  Math.floorDiv (numberOne, numberTwo);
			case '^' :
				return (int) Math.pow (numberOne, numberTwo);
			case '%':
				return (int) Math.IEEEremainder(numberOne, numberTwo);
		}
		return 0;
	}
}