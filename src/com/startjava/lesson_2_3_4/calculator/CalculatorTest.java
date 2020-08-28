package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		System.out.println("Калькулятор запущен!");
		do {
			Calculator calculator = new Calculator();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите математическое выражение: ");
			String srcExpression = scanner.nextLine();
			calculator.partition(srcExpression); // метод разделения
			System.out.print("Результат вычисления : ");
			System.out.println(calculator.calculate()); // метод расчета калькулятора
			do {
				System.out.print("Хотите продолжить? [да/нет] : ");
				answer = scanner.nextLine();
				System.out.println();
		 	} while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
		} while(answer.equalsIgnoreCase("yes"));
	}
}		