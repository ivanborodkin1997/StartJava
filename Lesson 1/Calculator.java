public class Calculator {
	public static void main(String[] args) {
		int a = 7, b = 3;
		char sign = '^';

		if(sign == '+') {
			System.out.println(a + b);
		} else if(sign == '-') {
			System.out.println(a - b);
		} else if(sign == '*') {
			System.out.println(a * b);
		} else if(sign == '/') {
			System.out.println(a / b);
		} else if(sign == '^') {
			int c = 1;
        	for(int i = 0 ; i < 3; i++)
            c *= 7;
        	System.out.println(c);        	
		} else if(sign == '%'){
			System.out.println(a % b);
		}
	}
}