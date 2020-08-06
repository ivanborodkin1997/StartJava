import java.util.Scanner;

public class CalculatorTest {
		public static void main(String[] args) {
			String yesOrNo;
			do{
				Calculator calculator = new Calculator();
				Scanner scanner = new Scanner(System.in);
				System.out.println();
				System.out.print("Введите первое число : ");
				int firstNumber = scanner.nextInt();
				System.out.print("Введите знак математической операции : ");
				char sign = scanner.next().charAt(0);
				System.out.print("Введите второе число : ");
				int secondNumber = scanner.nextInt();
				System.out.print("Результат вычисления : ");
				System.out.println(calculator.calculate(firstNumber,secondNumber,sign));
				System.out.println();

			
				do{
					System.out.print("Хотите продолжть? [да/нет] : ");
				
					yesOrNo = scanner.nextLine();
					if(yesOrNo == "нет")
		 				break;
		 		} while(yesOrNo != "да" && yesOrNo != "нет");
		 } while(yesOrNo == "да");
	}
}
			
				
		

				

		