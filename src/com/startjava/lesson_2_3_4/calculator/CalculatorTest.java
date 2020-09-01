package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String answer;
		System.out.println("Калькулятор запущен!");
		System.out.println(" ");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите математическое выражение: ");
			String srcExpression = scanner.nextLine();
			String[] array = srcExpression.split(" ");
			System.out.println("Результат вычисления : " + calculator.calculate(array)); // метод расчета калькулятора
			do {
				System.out.print("Хотите продолжить? [да/нет] : ");
				answer = scanner.nextLine();
		 	} while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
		} while(answer.equalsIgnoreCase("yes"));
	}
}		