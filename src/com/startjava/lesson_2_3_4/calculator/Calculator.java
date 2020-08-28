package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	int result;
	int[] numbers = new int[2];
	char sign;

	public void srcExpre(String srcExpression){
		String[] array = srcExpression.split(" ");
		numbers[0] = Integer.parseInt(array[0]);
		sign = array[1].charAt(0);
		numbers[1] = Integer.parseInt(array[2]);
	}

	public int calculate() {
		switch (sign) {
			case '+' :
				result = Math.addExact (numbers[0], numbers[1]);
				break;
			case '-' :
				result = Math.subtractExact(numbers[0], numbers[1]);
				break;
			case '*' :
				result = Math.multiplyExact(numbers[0], numbers[1]);
				break;
			case '/' :
				result = Math.floorDiv (numbers[0], numbers[1]);
				break;
			case '^' :
				result = (int) Math.pow (numbers[0], numbers[1]);
				break;   	
			case '%':
				result = (numbers[0] % numbers[1]);
				break;
		}
		return result;
	}
	
}