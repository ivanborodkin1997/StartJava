package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int[] enteredNum = new int[10];

	public Player(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getEnteredNum() {
		return Arrays.copyOf(enteredNum,enteredNum.length);
	}

	public void setEnteredNum(int index, int number) {
		enteredNum[index] = number;
	}

	public void nullify(){
		 Arrays.fill(enteredNum,0);
	}
}