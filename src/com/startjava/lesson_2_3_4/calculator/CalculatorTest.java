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
				
			System.out.print("\nВведите первое число : ");
			numbers[0] = scanner.nextInt();
			System.out.print("Введите знак математической операции : ");
			char sign = scanner.next().charAt(0);
			System.out.print("Введите второе число : ");
			numbers[1] = scanner.nextInt();
			System.out.print("Результат вычисления : ");


			System.out.println(calculator.calculate(numbers, sign));
			System.out.println();
			scanner.nextLine();
			do {
				System.out.print("Хотите продолжить? [да/нет] : ");
				yesOrNo = scanner.nextLine();
		 	} while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
		} while(yesOrNo.equalsIgnoreCase("yes"));
	}
}		