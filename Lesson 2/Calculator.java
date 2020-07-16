import java.util.Scanner;

public class Calculator {

		
	Scanner scanner = new Scanner(System.in);
	private int firstNumber = scanner.nextInt();
	private char sign = scanner.next().charAt(0);
	private int secondNumber = scanner.nextInt();

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public char getSign() {

		switch (sign) {
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
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}


