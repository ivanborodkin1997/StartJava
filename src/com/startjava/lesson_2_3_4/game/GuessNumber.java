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
            if(makeMove(playerOne, i))
                return;
            if(makeMove(playerTwo, i))
                return;
        }
    }

    private boolean makeMove (Player player,  int i) {
            inputNumber(player, i);
            return checkNumber(player);
    }

    private void inputNumber(Player player, int i) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scanner.nextInt());
        player.setEnteredNum(i, player.getNumber());
        player.setAttempt(i);
    }

    private boolean checkNumber(Player player) {
        if (computerNumber == player.getNumber()) {
            System.out.println("Ура!!! " + player.getName() + " угадал число " + player.getNumber() + " с " + (player.getAttept() + 1) + " попытки");
           /* if (computerNumber != playerOne.getNumber()) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки!");
            }
            if (computerNumber != playerTwo.getNumber()) {
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки!");
            }*/
            showResult(playerOne);
            showResult(playerTwo);
            return true;
        }
        String resultAnswer = (computerNumber > player.getNumber()) ? "маленькое... Попробуйте ввести число побольше!" : "большое... Попробуйте ввести число поменьше!";
        System.out.println("Упс, " + player.getName() + " ваше число слишком " + resultAnswer);
        return false;
    }

    private void showResult(Player player) {
        System.out.print(player.getName() + " за игру ввел следующие цифры: ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
        player.nullify();
    }
}
