package ua.hillel.maievskyi.lessons.lesson4;

public class Random {
    public static void main(String[] args) {
        System.out.println(( (int) (Math.random() *  101)));
        System.out.println( (int)(15 + Math.random() * 21)); // 15-35 random

        int min = 15;
        int max = 35;

        System.out.println((int) (Math.random() * (max - min+1) + min)); // !15-35 random
        System.out.println((int) (Math.random() * (max - min+1) + min));
        System.out.println((int) (Math.random() * (max - min+1) + min));
        System.out.println((int) (Math.random() * (max - min+1) + min));
        System.out.println((int) (Math.random() * (max - min+1) + min));
        System.out.println((int) (Math.random() * (max - min+1) + min));

    }
}
