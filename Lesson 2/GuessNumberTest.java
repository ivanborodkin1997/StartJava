import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String yesOrNo;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Первый игрок - введите своё имя : ");
			Player playerOne = new Player(scanner.nextLine());
			System.out.print("Второй игрок - введите своё имя : ");
			Player playerTwo = new Player(scanner.nextLine());
		
			new GuessNumber(playerOne,playerTwo);
			
			System.out.println();
			do{
				System.out.print("Хотите продолжить? [да/нет] : ");
				yesOrNo = scanner.nextLine();
			} while(!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
		} while(yesOrNo.equalsIgnoreCase("yes"));
	}
}