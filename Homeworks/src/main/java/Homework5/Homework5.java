package main.java.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int hour = rd.nextInt(24);
        System.out.println("Сейчас " + hour + " час(ов)!");

        boolean isEdekaOpenResult = isEdekaOpen(hour);
        boolean isReweOpenResult = isReweOpen(hour);

        canBuy(isEdekaOpenResult, isReweOpenResult);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeap(year);

        if (isLeapYear) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        int maxNumber = findMax(number1, number2, number3);

        System.out.println("Максимум из трех чисел: " + maxNumber);
    }

    static boolean isEdekaOpen(int hour) {
        if (hour >= 8 && hour <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isReweOpen(int hour) {
        if (hour >= 7 && hour <= 19) {
            return true;
        } else {
            return false;
        }
    }

    static void canBuy(boolean isEdekaOpenResult, boolean isReweOpenResult) {
        if (isEdekaOpenResult == true && isReweOpenResult == true) {
            System.out.println("Я могу пойти в магазин и купить еды в Edeke и в Rewe");
        } else if (isEdekaOpenResult == true) {
            System.out.println("Я могу пойти в магазин и купить еды в Edeke");
        } else if (isReweOpenResult == true) {
            System.out.println("Я могу пойти в магазин и купить еды в Rewe");
        } else {
            System.out.println("Все закрыто, придётся ждать до завтра!!!");
        }
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

