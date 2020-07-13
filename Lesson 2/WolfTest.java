public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("gendef = " + wolfOne.getGender());
		wolfOne.setGender("Woman");
		System.out.println("newGendef = " + wolfOne.getGender());
		System.out.println("name = " + wolfOne.getName());
		wolfOne.setName("Bobik");
		System.out.println("newName = " + wolfOne.getName());
		System.out.println("weigth = " + wolfOne.getWeigth());
		wolfOne.setWeigth(1.1f);
		System.out.println("newWeigth = " + wolfOne.getWeigth());
		System.out.println("age = " + wolfOne.getAge());
		wolfOne.setAge(9);
		System.out.println("newAge = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());
		wolfOne.setColor("White");
		System.out.println("newColor = " + wolfOne.getColor());

		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}