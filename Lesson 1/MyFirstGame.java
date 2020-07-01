

public class MyFirstGame {
	public static void main(String[] args) {
		int a = 55 ;  // число загаданное компьютером
		int b = 72 ;  // число введенное человеком
		

		do{
			if(a != b && a < b) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
			else if(a != b && a > b) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
			else{
				System.out.println("Вы угадали число!");
			}			

		}while(a == b);                               
	}
}