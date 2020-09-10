package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int computerNumber = (int) (Math.random() * 101);
    private Player playerOne;
    private Player playerTwo;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
            for (int i = 0;  i <  10; i++) {
                    System.out.print(playerOne.getName() + " введите число: ");
                    playerOne.setNumber(scanner.nextInt());
                    playerOne.setEnteredNum(i, playerOne.getNumber());
                    if (computerNumber > playerOne.getNumber()) {
                        System.out.println("Упс, " + playerOne.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
                    } else if (computerNumber < playerOne.getNumber()) {
                        System.out.println("Упс, " + playerOne.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
                    } else if (computerNumber == playerOne.getNumber()) {
                        System.out.println("Ура!!! " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " с " + ++i + " попытки");
                        break;
                    }

                    System.out.print(playerTwo.getName() + " введите число: ");
                    playerTwo.setNumber(scanner.nextInt());
                    playerTwo.setEnteredNum(i, playerTwo.getNumber());
                    if (computerNumber > playerTwo.getNumber()) {
                        System.out.println("Упс," + playerTwo.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
                    } else if (computerNumber < playerTwo.getNumber()) {
                        System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
                    } else if (computerNumber == playerTwo.getNumber()) {
                        System.out.println("Ура!!! " + playerTwo.getName() + "  угадал число " + playerTwo.getNumber() + " с " + ++i + " попытки");
                        break;
                    }
            }
            showResult(computerNumber, playerOne, playerTwo);
    }

    public void showResult(int computerNumber, Player playerOne, Player playerTwo){
        if(computerNumber == playerOne.getNumber() || computerNumber != playerTwo.getNumber()){
            System.out.println("Простите " + playerTwo.getName() + " вы проиграли. Игрок " + playerOne.getName() + " угадал число первым!");
        } else if(computerNumber != playerOne.getNumber() || computerNumber == playerTwo.getNumber()) {
            System.out.println("Простите " + playerOne.getName() + " вы проиграли. Игрок " + playerTwo.getName() + " угадал число первым!");
        } else if(computerNumber != playerOne.getNumber() && computerNumber != playerTwo.getNumber()) {
            System.out.println("У игрока " + playerOne.getName() + " кончились попытки. Вы проиграли(");
            System.out.println("У игрока " + playerTwo.getName() + " кончились попытки. Вы проиграли(");
        }
        System.out.println(playerOne.getName() + " за игру ввел следующие цифры: " + Arrays.toString(playerOne.getEnteredNum()));
        System.out.println(playerTwo.getName() + " за игру ввел следующие цифры: " + Arrays.toString(playerTwo.getEnteredNum()));
        playerOne.obnulenie();
        playerTwo.obnulenie();
    }
}

