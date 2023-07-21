package ua.hillel.maievskyi.lessons.lesson6.homework;

public class ShuttleNamer {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; counter <= 100; i++) {
            String numberStr = String.valueOf(i);
            if (numberStr.contains("4") || numberStr.contains("9")) {
                continue;
            }
            System.out.println("Shuttle number: " + i);
            counter++;
        }
    }
}