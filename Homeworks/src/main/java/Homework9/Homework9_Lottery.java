package main.java.Homework9;
import java.util.Random;
import java.util.Scanner;

public class Homework9_Lottery {
    public static void main(String[] args) {
        int setSize = 5; // количество номеров в игре
        int range = 50; // интервал генерации номеров
        int lucky; // генерируемое счастливое число


        // сгенерированные номера лотереи
        int[] luckyNumbers = new int[setSize];

        // номера введенные игроками
        int[] userNumbers1 = new int[setSize];
        int[] userNumbers2 = new int[setSize];
        int[] userNumbers3 = new int[setSize];

        Scanner scanner = new Scanner(System.in);

        // Ввод номеров первого игрока
        System.out.println("Игрок 1, введите номер от 1 до " + range);
        for (int i = 0; i < setSize; i++) {
            System.out.print("Введите " + (i + 1) + "-й номер = ");
            userNumbers1[i] = scanner.nextInt();
        }

        // Ввод номеров второго игрока
        System.out.println("Игрок 2, введите номер от 1 до " + range);
        for (int i = 0; i < setSize; i++) {
            System.out.print("Введите " + (i + 1) + "-й номер = ");
            userNumbers2[i] = scanner.nextInt();
        }

        // Ввод номеров третьего игрока
        System.out.println("Игрок 3, введите номер от 1 до " + range);
        for (int i = 0; i < setSize; i++) {
            System.out.print("Введите " + (i + 1) + "-й номер = ");
            userNumbers3[i] = scanner.nextInt();
        }

        Random random = new Random();
        for (int i = 0; i < setSize; i++) {
            lucky = random.nextInt(range);
            luckyNumbers[i] = lucky;
        }

        System.out.println("Выигрышные номера: " + luckyNumbers[0] + ", " + luckyNumbers[1] + ", " + luckyNumbers[2] + ", " + luckyNumbers[3] + ", " + luckyNumbers[4]);
        System.out.println("Номера игрока 1: " + userNumbers1[0] + ", " + userNumbers1[1] + ", " + userNumbers1[2] + ", " + userNumbers1[3] + ", " + userNumbers1[4]);
        System.out.println("Номера игрока 2: " + userNumbers2[0] + ", " + userNumbers2[1] + ", " + userNumbers2[2] + ", " + userNumbers2[3] + ", " + userNumbers2[4]);
        System.out.println("Номера игрока 3: " + userNumbers3[0] + ", " + userNumbers3[1] + ", " + userNumbers3[2] + ", " + userNumbers3[3] + ", " + userNumbers3[4]);
    }
}


