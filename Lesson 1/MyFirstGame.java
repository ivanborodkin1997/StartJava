

public class MyFirstGame {
	public static void main(String[] args) {
		int computerNumber = 55 ;  // число загаданное компьютером
		int personNumber = 0 ;  // число введенное человеком
		
		do {
			b++;
			if(a != b && a < b) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if(a != b && a > b) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else {
				System.out.println("Вы угадали число!");
			}			
		} while(a != b);                               
	}
}