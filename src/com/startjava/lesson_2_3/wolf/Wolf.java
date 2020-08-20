package com.startjava.lesson_2_3.wolf;

public class Wolf {

	private String gender = "man";
	private String name = "Nord";
	private float weigth = 1.3f;
	private int age = 7;
	private String  color = "Black";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return  name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		}
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Иди спокойно!");
	}

	public void sit() {
		System.out.println("Остановись и посиди, путник");
	}

	public void run() {
		System.out.println("Вы пробежали 5 км");
	}

	public void howl() {
		System.out.println("Видишь луну? Начинй выть!");
	}

	public void hunt() {
		System.out.println("Добудь себе еды");
	}
}