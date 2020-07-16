

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.print("Введите первое число : ");
		System.out.println(calculator.getFirstNumber());
		System.out.print("Введите знак математической операции : ");
		System.out.println(calculator.getSign());
		System.out.print("Введите второе число : ");
		System.out.println(calculator.getSecondNumber());
	}
}