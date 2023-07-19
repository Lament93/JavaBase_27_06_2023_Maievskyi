package ua.hillel.maievskyi.lessons.lesson5.homework;

import java.util.Scanner;

public class C_S_Calc {
    public static void main(String[] args) {

        int team1Player1;
        int team1Player2;
        int team1Player3;
        int team1Player4;
        int team1Player5;

        int team2Player1;
        int team2Player2;
        int team2Player3;
        int team2Player4;
        int team2Player5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву першої команди: ");
        String team1Name = scanner.nextLine();

       while (true) {
           System.out.println("Введіть кількість очок для 1-го гравця: ");
           if (scanner.hasNextInt()) {
               team1Player1 = scanner.nextInt();
               break;
           } else {
               System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
               scanner.nextLine();
           }
       }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 2-го гравця: ");
            if (scanner.hasNextInt()) {
                team1Player2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 3-го гравця: ");
            if (scanner.hasNextInt()) {
                team1Player3 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 4-го гравця: ");
            if (scanner.hasNextInt()) {
                team1Player4 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 5-го гравця: ");
            if (scanner.hasNextInt()) {
                team1Player5 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        System.out.println("Введіть назву другої команди: ");
        String team2Name = scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 1-го гравця: ");
            if (scanner.hasNextInt()) {
                team2Player1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 2-го гравця: ");
            if (scanner.hasNextInt()) {
                team2Player2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 3-го гравця: ");
            if (scanner.hasNextInt()) {
                team2Player3 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 4-го гравця: ");
            if (scanner.hasNextInt()) {
                team2Player4 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        while (true) {
            System.out.println("Введіть кількість очок для 5-го гравця: ");
            if (scanner.hasNextInt()) {
                team2Player5 = scanner.nextInt();
                break;
            } else {
                System.out.println("Значення не є числовим, будь ласка введіть кількість очок числом");
                scanner.nextLine();
            }
        }

        int team1SumScore;
        int team2SumScore;
        double team1AvgScore = (team1SumScore = team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5.0;
        double team2AvgScore = (team2SumScore = team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5.0;

        if (team1AvgScore > team2AvgScore) {
            System.out.println("Перемогла команда: " + team1Name + " з загальним результатом " + team1SumScore +
                    " очок, та середнім результатом " + team1AvgScore + " очок на одного гравця.");
        } else if (team2AvgScore > team1AvgScore) {
            System.out.println("Перемогла команда: " + team2Name + " з загальним результатом " + team2SumScore +
                    " очок, та середнім результатом " + team2AvgScore + " очок на одного гравця.");
        } else {
            System.out.println("Нічия! Обидві команди набрали по " + team1SumScore + " очок.");
        }
    }
}
