public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("gendef = " + wolfOne.gender);
		System.out.println("name = " + wolfOne.name);
		System.out.println("weigth = " + wolfOne.weigth);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}