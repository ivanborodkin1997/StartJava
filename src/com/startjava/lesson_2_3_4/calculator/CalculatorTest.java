package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String yesOrNo;
		System.out.println("Калькулятор запущен!");
		do {
			Calculator calculator = new Calculator();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите математическое выражение: ");
			String srcExpression = scanner.nextLine();
			calculator.srcExpre(srcExpression);
			System.out.print("Результат вычисления : ");
			System.out.println(calculator.calculate());
			do {
				System.out.print("Хотите продолжить? [да/нет] : ");
				yesOrNo = scanner.nextLine();
				System.out.println();
		 	} while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
		} while(yesOrNo.equalsIgnoreCase("yes"));
	}
}		