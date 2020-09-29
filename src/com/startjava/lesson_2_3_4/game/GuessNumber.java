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

    public void inputNumber(Player player) {
            System.out.print(player.getName() + " введите число: ");
            player.setNumber(scanner.nextInt());
    }

        public void play () {

            for (int i = 0; i < 10; i++) {
                inputNumber(playerOne);
                playerOne.setEnteredNum(i, playerOne.getNumber());
                playerOne.setAttempt(i);
                if (computerNumber > playerOne.getNumber()) {
                    System.out.println("Упс, " + playerOne.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
                } else if (computerNumber < playerOne.getNumber()) {
                    System.out.println("Упс, " + playerOne.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
                } else if (computerNumber == playerOne.getNumber()) {
                    System.out.println("Ура!!! " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " с " + (playerOne.getAttept() + 1) + " попытки");
                    break;
                }
                inputNumber(playerTwo);
                playerTwo.setEnteredNum(i, playerTwo.getNumber());
                playerTwo.setAttempt(i);
                if (computerNumber > playerTwo.getNumber()) {
                    System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
                } else if (computerNumber < playerTwo.getNumber()) {
                    System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
                } else if (computerNumber == playerTwo.getNumber()) {
                    System.out.println("Ура!!! " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " с " + (playerTwo.getAttept() + 1) + " попытки");
                    break;
                }
            }
            show(playerOne);
            show(playerTwo);
        }

        public void show (Player player){
            if (computerNumber != player.getNumber()) {
                showEndAttept(player);
            }
            showResult(player);
        }

        public void showResult (Player player){
            System.out.print(player.getName() + " за игру ввел следующие цифры: ");
            for (int i : player.getEnteredNums()) {
                System.out.print(i + " ");
            }
            System.out.println();
            zeroing(player);
        }

        public void zeroing(Player player){
            player.nullify();
        }

        public void showEndAttept (Player player){
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }
