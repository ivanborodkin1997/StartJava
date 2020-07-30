import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args){
		Player playerOne = new Player();
		Player playerTwo = new Player();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Первый игрок - введите своё имя : ");
		playerOne.setName(scanner.nextLine());
		System.out.print("Второй игрок - введите своё имя : ");
		playerTwo.setName(scanner.nextLine());
		int computerNumber = (int) (Math.random()*100);
		GuessNumber game = new GuessNumber();
		game.gamer(computerNumber,playerOne,playerTwo);

		
	}
}