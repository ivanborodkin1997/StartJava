package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		String yesOrNo;
		System.out.println("Калькулятор запущен!");
		int[] numbers = new int[3];

		
		do {
			Calculator calculator = new Calculator();
			Scanner scanner = new Scanner(System.in);

			System.out.print("Введите математическое выражение: ");
			String example = scanner.nextLine();
			String[] array = example.split(" ");
			numbers[0] = Integer.parseInt(array[0]);
			String sign = array[1];
			numbers[1] = Integer.parseInt(array[2]);

			System.out.print("Результат вычисления : ");

			System.out.println(calculator.calculate(numbers, sign));

			do {
				System.out.print("Хотите продолжить? [да/нет] : ");
				yesOrNo = scanner.nextLine();
				System.out.println();
		 	} while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
		} while(yesOrNo.equalsIgnoreCase("yes"));
	}
}		