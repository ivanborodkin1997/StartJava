import java.util.Scanner;

public class GuessNumber {
	Scanner scanner = new Scanner(System.in);
	private int computerNumber = (int) (Math.random()*101);
	Player playerOne;
    Player playerTwo;
    
	GuessNumber( Player playerOne, Player playerTwo) {
		do {
			System.out.print(playerOne.name + " введите число: ");
			playerOne.setNumber(scanner.nextInt());
			if(computerNumber > playerOne.getNumber()) {
				System.out.println("Упс, " + playerOne.name + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
			} else if(computerNumber < playerOne.getNumber()){
				System.out.println("Упс, " + playerOne.name + " ваше число слишком большое... Попробуйте ввести число поменьше!");
			} else if(computerNumber == playerOne.getNumber()) {
				System.out.println("Ура!!!" + playerOne.name + " Вы угадали");
				break;
			} 

			System.out.print(playerTwo.name + " введите число: ");
			playerTwo.setNumber(scanner.nextInt());
			if(computerNumber > playerTwo.getNumber()) {
				System.out.println("Упс," + playerTwo.name + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
			} else if(computerNumber < playerTwo.getNumber()){
				System.out.println("Упс, " + playerTwo.name + " ваше число слишком большое... Попробуйте ввести число поменьше!");
			} else if(computerNumber == playerTwo.getNumber()) {
				System.out.println("Ура!!! " + playerTwo.name + " Вы угадали");
				break;
			} 
		} while(true);
	}
}
