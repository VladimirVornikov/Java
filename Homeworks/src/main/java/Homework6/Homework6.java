package main.java.Homework6;

import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {
        Random rd = new Random();

        int nAccount = rd.nextInt(100);  // инициализация денежного счета
        System.out.println("Количество дней для снятия денежного баланса в размере " + nAccount + " $" + " займет " + withdrawMoney(nAccount));


        int randomTemperature1 = rd.nextInt(500); // температура в первой колбе
        int randomTemperature2 = rd.nextInt(273) - 273; //температура во второй колбе
        System.out.println("Температур в первой колбе равна = " + randomTemperature1 + " C");
        System.out.println("Температур во второй колбе равна = " + randomTemperature2 + " C");
        if (tempController(randomTemperature1, randomTemperature2) == true) { // проверка работы устройства
            System.out.println("Устройство работает корректно !!! ");
        } else {
            System.err.println("Температура в одной или обеих колб превышает допустимый диапозон ");
        }
    }

    static boolean tempController(int randomTemperature1, int randomTemperature2) { // условие определения температуры в устройстве
        if (100 <= randomTemperature1 && -100 >= randomTemperature2) {
            return true;

        } else {
            return false;
        }
    }

    public static int withdrawMoney(int nAccount) { //  Проверка дней для снятия денег
        int days = 0;
        while (nAccount > 0) {
            int divisorForDay = biggestDivisor(nAccount);
            nAccount -= divisorForDay;
            days++;
        }
        return days;
    }

    public static int biggestDivisor(int nAccount) {
        for (int x = nAccount - 1; x > 0; x--) {
            if (nAccount % x == 0) {
                return x;
            }
        }
        return 1;
    }
}
