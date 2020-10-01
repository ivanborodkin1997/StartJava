package com.startjava.lesson_2_3_4.game;

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
        for (int i = 0; i < 10; i++) {
            inputNumber(playerOne, i);
            if (computerNumber == playerOne.getNumber()) {
                break;
            }
            inputNumber(playerTwo, i);
            if (computerNumber == playerTwo.getNumber()) {
                break;
            }
        }
        checkAttepts(playerOne);
        checkAttepts(playerTwo);
    }

    public void inputNumber(Player player, int i) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scanner.nextInt());
        player.setEnteredNum(i, player.getNumber());
        player.setAttempt(i);
        checkNumber(player);
    }

    public void checkNumber (Player player) {
        if (computerNumber > player.getNumber()) {
            System.out.println("Упс, " + player.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
        } else if (computerNumber < player.getNumber()) {
            System.out.println("Упс, " + player.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
        } else if (computerNumber == player.getNumber()) {
            System.out.println("Ура!!! " + player.getName() + " угадал число " + player.getNumber() + " с " + (player.getAttept() + 1) + " попытки");
        }
    }

    public void checkAttepts (Player player) {
        if (computerNumber != player.getNumber()) {
            showEndAttept(player);
        }
        showResult(player);
    }

    public void showResult (Player player) {
        System.out.print(player.getName() + " за игру ввел следующие цифры: ");
        for (int i : player.getEnteredNums()) {
            System.out.print(i + " ");
        }
        System.out.println();
        zeroOutArray(player);
    }

    public void zeroOutArray (Player player) {
        player.nullify();
    }

    public void showEndAttept (Player player) {
        System.out.println("У игрока " + player.getName() + " закончились попытки!");
    }
}
