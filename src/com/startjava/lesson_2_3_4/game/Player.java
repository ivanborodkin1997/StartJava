package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int endOfArray;
	private int[] enteredNums = new int[10];


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

	public void setEndOfArray(int endOfArray){
		this.endOfArray = endOfArray;
	}

	public int[] getEnteredNums() {
		return Arrays.copyOf(enteredNums,endOfArray+1);
	}

	public void setEnteredNums(int index, int number) {
		enteredNums[index] = number;
	}

	public void nullify(){
		 Arrays.fill(getEnteredNums(),0);
	}
}