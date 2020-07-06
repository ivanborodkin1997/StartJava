public class MyFirstGame {
	public static void main(String[] args) {
		int computerNumber = 55 ;  // число загаданное компьютером
		int playerNumber = 0 ;  // число введенное человеком
		
		do {
			playerNumber++;
			if(computerNumber < playerNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if(computerNumber > playerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else {
				System.out.println("Вы угадали число!");
			}			
		} while(computerNumber != playerNumber);                               
	}
}