package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String playerAnswer;
        System.out.println("Игра началась!");
        System.out.println("У вас 10 попыток!\n");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Первый игрок - введите своё имя : ");
            Player playerOne = new Player(scanner.nextLine());
            System.out.print("Второй игрок - введите своё имя : ");
            Player playerTwo = new Player(scanner.nextLine());

            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.play();
            do {
                System.out.print("Хотите продолжить? [да/нет] : ");
                playerAnswer = scanner.nextLine();
            } while (!playerAnswer.equalsIgnoreCase("yes") && !playerAnswer.equalsIgnoreCase("no"));
        } while (playerAnswer.equalsIgnoreCase("yes"));
    }
}