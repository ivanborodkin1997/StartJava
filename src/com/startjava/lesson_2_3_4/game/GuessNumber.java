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
            if (checkNumber(playerOne) == true) {
                break;
            }
            inputNumber(playerTwo, i);
            if (checkNumber(playerTwo) == true) {
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
    }

    public boolean checkNumber(Player player) {
        if (computerNumber == player.getNumber()) {
            System.out.println("Ура!!! " + player.getName() + " угадал число " + player.getNumber() + " с " + (player.getAttept() + 1) + " попытки");
            return true;
        }
        String resultAnswer = (computerNumber > player.getNumber()) ? "маленькое... Попробуйте ввести число побольше!" : "большое... Попробуйте ввести число поменьше!";
        System.out.println("Упс, " + player.getName() + " ваше число слишком " + resultAnswer);
        return false;
    }

    public void checkAttepts(Player player) {
        if (computerNumber != player.getNumber()) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
        showResult(player);
    }

    public void showResult(Player player) {
        System.out.print(player.getName() + " за игру ввел следующие цифры: ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
        player.nullify();
    }
}
