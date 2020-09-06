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
                playerOne.getSaveNumber()[i] = playerOne.getNumber();
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
                playerTwo.getSaveNumber()[i] = playerTwo.getNumber();
                if (computerNumber > playerTwo.getNumber()) {
                    System.out.println("Упс," + playerTwo.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
                } else if (computerNumber < playerTwo.getNumber()) {
                    System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
                } else if (computerNumber == playerTwo.getNumber()) {
                    System.out.println("Ура!!! " + playerTwo.getName() + "  угадал число " + playerTwo.getNumber() + " с " + ++i + " попытки");
                    break;
                }
            }

            int[] numberCopy = Arrays.copyOf(playerOne.getSaveNumber(), playerOne.getSaveNumber().length);
            System.out.println(playerOne.getName() + " за игру ввел следующие цифры: " + Arrays.toString(numberCopy));
            int[] numberCopy1 = Arrays.copyOf(playerTwo.getSaveNumber(), playerTwo.getSaveNumber().length);
            System.out.println(playerTwo.getName() + " за игру ввел следующие цифры: " + Arrays.toString(numberCopy1));
    }
}

