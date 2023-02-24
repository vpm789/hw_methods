import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOS(int typeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0) {
            if (clientDeviceYear > currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (typeOS == 1) {
            if (clientDeviceYear > currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
        } else {
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
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
        int typeOS = 1;
        int clientDeviceYear = 2019;
        checkOS(typeOS, clientDeviceYear);
    }

    private static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        int deliveryDistance = 105;
        int deliveryDays = deliveryDays(deliveryDistance);
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
}