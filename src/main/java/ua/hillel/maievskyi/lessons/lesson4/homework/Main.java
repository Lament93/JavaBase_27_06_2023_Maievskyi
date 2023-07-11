package ua.hillel.maievskyi.lessons.lesson4.homework;

public class Main {
    public static void main(String[] args) {
        int length = 13;
        int width = 16;
        int height = 21;

        int volume = length * width * height;

        System.out.println("Об'єм паралелепіпеда = " + volume + " см³");

        int totalLength = 4 * (length + width + height);

        System.out.println("Сумарна довжина всіх сторін = " + totalLength + " см");
    }
}
