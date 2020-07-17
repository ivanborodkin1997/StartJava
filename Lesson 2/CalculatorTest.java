import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число : ");
		int firstNumber = scanner.nextInt();
		System.out.print("Введите знак математической операции : ");
		char sign = scanner.next().charAt(0);
		System.out.print("Введите второе число : ");
		int secondNumber = scanner.nextInt();
		System.out.print("Результат вычисления : ");
		int result = 0;

		System.out.println(calculator.calculate(firstNumber,secondNumber,sign,result));
	}
}