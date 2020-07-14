import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число : ");
		int firstNumber = scanner.nextInt();
		System.out.print("Введите знак математической операции : ");
		char sign = scanner.next().charAt(0);
		System.out.print("Введите второе число : ");
		int secondNumber = scanner.nextInt();

		switch (sign ) {
			case '+' :
			System.out.print("Результат сложения : "); 
			System.out.println(firstNumber + secondNumber);
			break;
			case '-' :
			System.out.print("Результат вычетания : ");
			System.out.println(firstNumber - secondNumber);
			break;
			case '*' :
			System.out.print("Результат умножения : ");
			System.out.println(firstNumber * secondNumber);
			break;
			case '/' : 
			System.out.print("Результат деления : ");
			System.out.println(firstNumber / secondNumber);
			break;
			case '^' :
			int numberInDegree = 1;
			for(int i = 0; i < secondNumber; i++) {
				numberInDegree *= firstNumber;
			}
			System.out.print("Результат возведения в квадрат : ");
			System.out.println(numberInDegree); 
			break;   	
			case '%':
			System.out.print("Результат остатка от деления : ");
			System.out.println(firstNumber % secondNumber);
			break;
		}
	}
}