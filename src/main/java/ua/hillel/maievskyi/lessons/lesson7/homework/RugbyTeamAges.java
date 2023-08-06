package ua.hillel.maievskyi.lessons.lesson7.homework;

import java.util.Arrays;
import java.util.Random;

public class RugbyTeamAges {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        int[] teamAges1 = new int[teamSize];
        int[] teamAges2 = new int[teamSize];
        Random random = new Random();

        for (int i = 0; i < teamAges1.length; i++) {
            teamAges1[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }

        for (int i = 0; i < teamAges2.length; i++) {
            teamAges2[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }

        System.out.println("Вік гравців команди 1: " + Arrays.toString(teamAges1));
        System.out.println("Вік гравців команди 2: " + Arrays.toString(teamAges2));

        int sumAges1 = 0;
        for (int age : teamAges1) {
            sumAges1 += age;
        }
        double averageAge1 = (double) sumAges1 / teamAges1.length;
        System.out.println("Середній вік команди 1: " + averageAge1);

        int sumAges2 = 0;
        for (int age : teamAges2) {
            sumAges2 += age;
        }
        double averageAge2 = (double) sumAges2 / teamAges2.length;
        System.out.println("Середній вік команди 2: " + averageAge2);
    }
}