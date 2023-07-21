package ua.hillel.maievskyi.lessons.lesson6.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int minNumber = 0;
        int maxNumber = 10;
        int attemptsCount = 3;
        int inputNumber;

        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber - minNumber);

        System.out.println("Вгадайте число від " + minNumber + " до " + maxNumber + ", у Вас є " + attemptsCount + " спроби.");

        Scanner scanner = new Scanner(System.in);
        do {
            while (true) {
                System.out.print("Введіть ваше число: ");
                if (scanner.hasNextInt()) {
                    inputNumber = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Значення не є числовим, будь ласка введіть число від " + minNumber + " до " + maxNumber);
                    scanner.nextLine();
                }
            }

            if (inputNumber == randomNumber) {
                System.out.println("Ви вгадали! Це число " + randomNumber + "!");
                break;
            } else if (inputNumber != randomNumber) {
                attemptsCount = attemptsCount - 1;
                System.out.println("Неправильна відповідь, у Вас ще є " + attemptsCount + " спроб.");
                scanner.nextLine();
            }
        } while (attemptsCount > 0);
        if (inputNumber != randomNumber){
            System.out.println("Ви не вгадали число, гру закінчено! Загадане число було: " + randomNumber);
        }
    }
}