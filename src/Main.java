public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
    }

    private static void task1() {
        System.out.println("");
        System.out.println("Задача №1");
        int year = 2020;
        checkLeapYear(year);
    }

    private static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
    }

    private static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
    }
}