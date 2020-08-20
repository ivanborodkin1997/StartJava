package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int computerNumber = 57 ;  // число загаданное компьютером
		int playerNumber = 55;  // число введенное человеком
		
		do {
			if(computerNumber < playerNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
			}
			else if(computerNumber > playerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNumber++;
			}	
		} while(computerNumber != playerNumber);
		System.out.println("Вы угадали число!");                           
	}
}