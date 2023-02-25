import java.time.LocalDate;
import java.util.Arrays;

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

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static void checkDouble(String str) {
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length - 1; i++) {
            for (int j = i + 1; j < charStr.length; j++) {
                if (charStr[i] == charStr[j]) {
                    System.out.println("В строке есть повторящийся символ - " + charStr[i]);
                    return;
                }
            }
        }
    }

    public static int calculateSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return sum;
    }

    public static double calcAvr(int sum, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        double avr = (double) sum / count;
        return avr;
    }

    public static void main(String[] args) {
        /*task1();
        task2();
        task3();*/
        task4();
        task5();
        task6();
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

    private static void task4() {
        System.out.println("");
        System.out.println("Задача №4");
        int[] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void task5() {
        System.out.println("");
        System.out.println("Задача №5");
        String str = "abaccddefgghiijjkk";
        checkDouble(str);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task6() {
        System.out.println("");
        System.out.println("Задача №6");
        int[] arr = generateRandomArray();
        int sum = calculateSum(arr);
        System.out.println("Сумма затрат - " + sum);
        double avr = calcAvr(sum, arr);
        System.out.printf("Средняя сумма затрат в день %.2f рублей ", avr);
    }

}