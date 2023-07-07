package ua.hillel.maievskyi.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
//        System.out.println(4+6);
//        System.out.println(4/6);
//        System.out.println(4*6);
//        System.out.println(4-6);

//        int a = 12;
//        int b = 5;
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);

//        int a = 10;
//        int b = 3;
//        System.out.println((double) a/b);
//        System.out.println(10.0 / 3);
//        System.out.println(10 % 4);

//        int a = 10;
////        a = a + 5;
//        System.out.println(a);
//        a %= 5;

//        a = a + 1;
//        a+= 1;
//        a++;
//        int a = 10;
//        int b = 5;
//
//        int result = ++a - b++ - a++ + ++a;
//        System.out.println("result = " + result);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        int a = 700;
        int b = 2000;
        int c = 3500;

        int countMonth10Years = 10 * 12;

        int salary1 = a * countMonth10Years;
        int salary2 = b * countMonth10Years;
        int salary3 = c * countMonth10Years;

        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);

        double tax = 0.95;

        double salary1WithoutTax = salary1 * tax;
        double salary2WithoutTax = salary2 * tax;
        double salary3WithoutTax = salary3 * tax;


        System.out.println("Salary1 Without TAX " + salary1WithoutTax);
        System.out.println("Salary2 Without TAX " + salary2WithoutTax);
        System.out.println("Salary3 Without TAX " + salary3WithoutTax);

        int avg = (int) ((salary1WithoutTax + salary2WithoutTax + salary3WithoutTax) / 3);
        System.out.println("Average salary: " + avg);
    }

}
