package ua.hillel.maievskyi.lessons.lesson4.homework;

public class LiVersusMin {
    public static void main(String[] args) {
        int liTroops = 860;
        int minTroops = (int) (1.5 * liTroops);

        int liAttackRate = (13 + 24 + 46) * liTroops;
        int minAttackRate = (9 + 35 + 12) * minTroops;

        System.out.println("Li Dynasty Attack Rate : " + liAttackRate);
        System.out.print("Min Dynasty Attack Rate : " + minAttackRate);
    }
}