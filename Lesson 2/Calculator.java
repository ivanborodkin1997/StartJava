

public class Calculator {
	public int calculate(int firstNumber, int secondNumber, char sign, int resault) {
			switch (sign) {
			case '+' : resault = (firstNumber + secondNumber);
			break;
			case '-' : resault = (firstNumber - secondNumber);
			break;
			case '*' : resault = (firstNumber * secondNumber);
			break;
			case '/' : resault = (firstNumber / secondNumber);
			break;
			case '^' : int numberInDegree = 1;
				for(int i = 0; i < secondNumber; i++) {
					numberInDegree *= firstNumber;
				}
				resault = numberInDegree; 
			break;   	
			case '%': resault = (firstNumber % secondNumber);
			break;
		}
		return resault;
	}
	
}


