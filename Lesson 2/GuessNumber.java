import java.util.Scanner;
public class GuessNumber {
	Scanner scanner = new Scanner(System.in);
	void gamer(int computerNumber, Player playerOne, Player playerTwo) {
		do{
			System.out.print(playerOne.getName() + " введите число:");
			playerOne.setNumber(scanner.nextInt());
			if(computerNumber > playerOne.getNumber()) {
				System.out.println("Упс, " + playerOne.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
			} else if(computerNumber < playerOne.getNumber()){
				System.out.println("Упс, " + playerOne.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
			} else if(computerNumber == playerOne.getNumber()) {
				System.out.println("Ура!!!" + playerOne.getName() + " Вы угадали");
				break;
			} 
			System.out.print(playerTwo.getName() + " введите число:");
			playerTwo.setNumber(scanner.nextInt());
			if(computerNumber > playerTwo.getNumber()) {
				System.out.println("Упс," + playerTwo.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
			} else if(computerNumber < playerTwo.getNumber()){
				System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
			} else if(computerNumber == playerTwo.getNumber()) {
				System.out.println("Ура!!! " + playerTwo.getName() + " Вы угадали");
				break;
			} 
		} while(computerNumber!=playerOne.getNumber()||computerNumber!=playerTwo.getNumber());
	}
}
