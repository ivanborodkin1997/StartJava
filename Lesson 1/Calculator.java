public class Calculator {
	public static void main(String[] args) {
		int firstNumber = 7;
		int secondNumber = 3;
		char sign = '^';

		if(sign == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if(sign == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if(sign == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if(sign == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if(sign == '^') {
			int numberInDegree = 1;
			for(int i = 0 ; i < secondNumber; i++) {
				numberInDegree *= firstNumber;
			}
			System.out.println(numberInDegree);    	
		} else if(sign == '%') {
			System.out.println(firstNumber % secondNumber);
		}
	}
}