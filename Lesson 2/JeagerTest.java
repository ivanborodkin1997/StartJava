public class JeagerTest {
	public static void main(String[] args) {
			System.out.println("Сравнение двух Ягерей: ");
			System.out.println();
			Jeager jeagerOne = new Jeager();
			jeagerOne.setLaunched("December 30, 2015");
			System.out.println("Launched = " + jeagerOne.getLaunched() + ";");
			jeagerOne.setMark("Mark - 1");
			System.out.println("Mark = " + jeagerOne.getMark() + ";");
			jeagerOne.setOrigin("Japan");
			System.out.println("Origin = " + jeagerOne.getOrigin() + ";");
			jeagerOne.setHeight(86.34f);
			System.out.println("Height = " + jeagerOne.getHeight() + " m;");
			jeagerOne.setWeight(2.312f);
			System.out.println("Weight = " + jeagerOne.getWeight() + " tons;");
			jeagerOne.setSpeed(5);
			System.out.println("Speed = " + jeagerOne.getSpeed() + ";");
			jeagerOne.setStrength(7);
			System.out.println("Strength = " + jeagerOne.getStrength() + ";");
			jeagerOne.setArmor(4);
			System.out.println("Armor = " + jeagerOne.getArmor() + ";");
			jeagerOne.drift();
			jeagerOne.move();
			System.out.println();
			
			Jeager jeagerTwo = new Jeager();
			jeagerTwo.setLaunched("November 2, 2019");
			System.out.println("Launched = " + jeagerTwo.getLaunched() + ";");
			jeagerTwo.setMark("Mark - 5");
			System.out.println("Mark = " + jeagerTwo.getMark() + ";");
			jeagerTwo.setOrigin("Australia");
			System.out.println("Origin = " + jeagerTwo.getOrigin() + ";");
			jeagerTwo.setHeight(76.2f);
			System.out.println("Height = " + jeagerTwo.getHeight() + " m;");
			jeagerTwo.setWeight(1.850f);
			System.out.println("Weight = " + jeagerTwo.getWeight() + " tons;");
			jeagerTwo.setSpeed(10);
			System.out.println("Speed = " + jeagerTwo.getSpeed() + ";");
			jeagerTwo.setStrength(10);
			System.out.println("Strength = " + jeagerTwo.getStrength() + ";");
			jeagerTwo.setArmor(9);
			System.out.println("Armor = " + jeagerTwo.getArmor() + ";");
			jeagerTwo.drift();
			jeagerTwo.move();
		}
	}