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
			int c = 1;
			for(int i = 0 ; i < 3; i++)
				c *= 7;
			System.out.println(c);        	
		} else if(sign == '%') {
			System.out.println(firstNumber % secondNumber);
		}
	}
}