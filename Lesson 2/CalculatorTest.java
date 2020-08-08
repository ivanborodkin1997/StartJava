import java.util.Scanner;

public class CalculatorTest {
		public static void main(String[] args) {
			String yesOrNo;
			
			do {
				Calculator calculator = new Calculator();
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("\nВведите первое число : ");
				int firstNumber = scanner.nextInt();
				System.out.print("Введите знак математической операции : ");
				char sign = scanner.next().charAt(0);
				System.out.print("Введите второе число : ");
				int secondNumber = scanner.nextInt();
				System.out.print("Результат вычисления : ");
				System.out.println(calculator.calculate(firstNumber, secondNumber, sign));
				System.out.println();
				scanner.nextLine();
				do{
					System.out.print("Хотите продолжить? [да/нет] : ");
					yesOrNo = scanner.nextLine();
		 		} while(!"yes".equalsIgnoreCase(yesOrNo) && !"no".equalsIgnoreCase(yesOrNo));
		 } while("yes".equalsIgnoreCase(yesOrNo));
	}
}
			
				
		

				

		