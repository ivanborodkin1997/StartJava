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
            for (int i = 0;  i < 10; i++) {
                    System.out.print(playerOne.getName() + " введите число: ");
                    playerOne.setNumber(scanner.nextInt());
                    playerOne.setEnteredNum(i, playerOne.getNumber());
                    playerOne.setAttempt(i);
                    if (computerNumber > playerOne.getNumber()) {
                        showComputerNumberMorePlayerOneNumber(playerOne);
                    } else if (computerNumber < playerOne.getNumber()) {
                        showComputerNumberLessPlayerOneNumber(playerOne);
                    } else if (computerNumber == playerOne.getNumber()) {
                        showComputerNumberEquallyPlayerOneNumber(playerOne);
                        break;
                    }

                    System.out.print(playerTwo.getName() + " введите число: ");
                    playerTwo.setNumber(scanner.nextInt());
                    playerTwo.setEnteredNum(i, playerTwo.getNumber());
                    playerTwo.setAttempt(i);
                    if (computerNumber > playerTwo.getNumber()) {
                        showComputerNumberMorePlayerTwoNumber(playerTwo);
                    } else if (computerNumber < playerTwo.getNumber()) {
                        showComputerNumberLessPlayerTwoNumber(playerTwo);
                    } else if (computerNumber == playerTwo.getNumber()) {
                        showComputerNumberEquallyPlayerTwoNumber(playerTwo);
                        break;
                    }
            }
            showResult(playerOne, playerTwo);
    }

    public void showComputerNumberMorePlayerOneNumber(Player playerOne){
        System.out.println("Упс, " + playerOne.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
    }

    public void showComputerNumberLessPlayerOneNumber(Player playerOne){
        System.out.println("Упс, " + playerOne.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
    }

    public void showComputerNumberEquallyPlayerOneNumber(Player playerOne){
        System.out.println("Ура!!! " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " с " + (playerOne.getAttept() + 1) + " попытки");
        System.out.println("Простите " + playerTwo.getName() + " вы проиграли. Игрок " + playerOne.getName() + " угадал число первым!");
    }

    public void showComputerNumberMorePlayerTwoNumber(Player playerTwo){
        System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком маленькое... Попробуйте ввести число побольше!");
    }

    public void showComputerNumberLessPlayerTwoNumber(Player playerTwo){
        System.out.println("Упс, " + playerTwo.getName() + " ваше число слишком большое... Попробуйте ввести число поменьше!");
    }

    public void showComputerNumberEquallyPlayerTwoNumber(Player playerTwo){
        System.out.println("Ура!!! " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " с " + (playerTwo.getAttept() + 1) + " попытки");
        System.out.println("Простите " + playerOne.getName() + " вы проиграли. Игрок " + playerTwo.getName() + " угадал число первым!");
    }

    public void showResult(Player playerOne, Player playerTwo) {
            if(computerNumber != playerOne.getNumber() && computerNumber != playerTwo.getNumber()) {
            showEndAttept(playerOne, playerTwo);
            }
            System.out.print(playerOne.getName() + " за игру ввел следующие цифры: ");
            for(int i = 0; i < playerOne.getEnteredNums().length; i++){
                System.out.print(playerOne.getEnteredNums()[i] + " ");
            }
            System.out.println();
            System.out.print(playerTwo.getName() + " за игру ввел следующие цифры: " );
            for(int i = 0; i < playerTwo.getEnteredNums().length; i++){
            System.out.print(playerTwo.getEnteredNums()[i] + " ");
            }
            System.out.println();
            playerOne.nullify();
            playerTwo.nullify();
    }

    public void showEndAttept(Player playerOne, Player playerTwo){
        System.out.println("У игрока " + playerOne.getName() + " закончились попытки!");
        System.out.println("У игрока " + playerTwo.getName() + " закончились попытки!");
    }
}

