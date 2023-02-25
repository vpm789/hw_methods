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
        /*Напишите метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
        Подобное задание вы решали в домашнем задании по массивам.
        - Текст прошлого задания
            Отойдем от подсчетов.
            В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали
            отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ
            вонавИ».
            Данные с именами сотрудников хранятся в виде массива символов (char[]).
            Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном
            виде. В качестве данных для массива используйте:
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            В результате в консоль должно быть выведено "Ivanov Ivan".
            **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно
            пройти по массиву циклом и распечатать его элементы в правильном порядке.
        В метод приходит массив, допустим:
        {3, 2, 1, 6, 5}.
        Нужно без вспомогательного массива переместить элементы так, чтобы поданный массив стал:
        {5, 6, 1, 2, 3}.
        Рекомендуем написать этот метод без возвращаемого значения. Вы будете приятно удивлены, что
        даже если мы не вернем массив, первоначальный массив изменится, когда мы будем модернизировать
        пришедший в виде параметра массив внутри метода.*/
        System.out.println("");
        System.out.println("Задача №4");
        int[] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void task5() {
        /*Вернемся к задаче о валидаторе текста из урока по строкам.
        - Условие задачи из урока 1.7
            ### Повышенная сложность. Задание 8
                Дана строка из букв английского алфавита "aabccddefgghiijjkk".
                Нужно найти и напечатать буквы, которые дублируются в строке.
                Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
                В итоге в консоль должен быть выведен результат программы: "acdgijk".
                - Критерии оценки
                – Данные в строке отсортированы корректно.
                –При изменении содержания строки результат программы выполняется.
                – Результат программы выведен в консоль согласно условиям задачи.
        Напишите метод, который в виде параметра принимает отсортированную строку.
        Например, aabccddefgghiijjkk.
        С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль сообщение об этом.
        Если дубль найден, нужно прервать поиск по остальным символам и вывести сообщение о присутствии
        дубля, причем с указанием, какой именно символ задублирован. Затем сразу же прервать выполнение
        метода. Сам метод ничего возвращать не должен (void).*/
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
        /*Снова вспоминаем домашнее задание по массивам. В нем была задача, которая требовала высчитать
        среднюю выплату за день.
        Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч, для его генерации
        допускается использовать метод из прошлого домашнего задания.
        - Текст прошлого задания
            Нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
            Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму
            всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
            «Средняя сумма трат за месяц составила … рублей».
            **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым,
            а дробным числом).
        Нужно сгенерировать массив, подать его в наш метод, а внутри метода подсчитать сумму элементов
        и вычислить среднее значение, которое нужно вернуть из метода в виде результата.
        Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
        То есть для работы этого метода нужно будет создать еще методы (1 или более), которые его
        будут обслуживать и вычислять промежуточные результаты. Среднее значение нужно вычислять в
        дробном виде, так как результат должен быть точным.*/
        System.out.println("");
        System.out.println("Задача №6");
        int[] arr = generateRandomArray();
        int sum = calculateSum(arr);
        System.out.println("Сумма затрат - " + sum);
        double avr = calcAvr(sum, arr);
        System.out.printf("Средняя сумма затрат в день %.2f рублей ", avr);
    }

}