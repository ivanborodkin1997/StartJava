package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	public int calculate(int[] numbers, String sign) {
		switch (sign) {
			case "+" :
				numbers[2] = Math.addExact (numbers[0], numbers[1]);
				break;
			case "-" :
				numbers[2]= Math.subtractExact(numbers[0],numbers[1]);
				break;
			case "*" :
				numbers[2] = Math.multiplyExact(numbers[0], numbers[1]);
				break;
			case "/" :
				numbers[2] = Math.floorDiv (numbers[0],numbers[1]);
				break;
			case "^" :
				numbers[2] = (int) Math.pow (numbers[0],numbers[1]);
				break;   	
			case "%":
				numbers[2]= (numbers[0] % numbers[1]);
				break;
		}
		return numbers[2];
	}
	
}