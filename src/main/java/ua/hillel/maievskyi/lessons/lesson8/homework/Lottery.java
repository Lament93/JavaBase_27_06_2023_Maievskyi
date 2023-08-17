package ua.hillel.maievskyi.lessons.lesson8.homework;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int maxNumber = 7;
        Random random = new Random();

        int[] array1 = new int[maxNumber];
        int[] array2 = new int[maxNumber];

        for (int i = 0; i < maxNumber; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }

        System.out.println("Перший масив: " + Arrays.toString(array1));
        System.out.println("Другий масив: " + Arrays.toString(array2));
        System.out.println("Кількість збігів: " + counter);
    }
}
