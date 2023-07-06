package main.java.Homework4;
import java.util.Scanner;

import java.util.Random;
public class Homework4_1 {

    public static void main(String[] args) {
//        nearestNum();
        secondsToTime();
//
    }
    static void nearestNum() {
        double main_number = 10.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();
        double result1 = Math.abs(main_number - num1);
        double result2 = Math.abs(main_number - num2);
        if (result1 > result2) {
            System.out.println("Число " + num2 + " ближе к 10");
        } else {
            System.out.println("Число " + num1 + " ближе к 10");
        }

    }
    static void secondsToTime() {
        Random rd = new Random();
        int sec = rd.nextInt(28800)+1;
        System.out.println("Текущее количество секунд = " + sec);
        int timeDefaultHours = 16;
        int timeDefaultMinutes = 60;
        int timeDefaultSeconds = 60;
        int hours = sec/3600;
        int minutes = (sec%3600)/60;
        int seconds = sec%60;
        int subHours = timeDefaultHours-hours;
        int subMinute =timeDefaultMinutes-minutes;
        int subSeconds = timeDefaultSeconds-seconds;
        if (hours > 2) {
            System.out.println("Сейчас "+ subHours +":" +subMinute +
                    ":" + subSeconds +". А значит, осталось " + hours + " часов " + minutes + " минут " +  seconds +
                    " секунды до конца рабочей смены! ^_^");
        }else if (hours == 1) {
            System.out.println("Сейчас " + subHours + ":" + subMinute +
                    ":" + subSeconds +  ". А значит, остался " + hours + " часа " + minutes + " минут " + seconds +
                    " секунды до конца рабочей смены! ^_^");
        } else  {
            System.out.println("Сейчас "+(timeDefaultHours-hours) +":" +(timeDefaultMinutes-minutes) +
                    ":"+ (timeDefaultSeconds-seconds) +". А значит, осталось " + minutes + " минут " +  seconds +
                    " секунды до конца рабочей смены! ^_^");

        }
    }
}

////  Ответы на тест:
//1.b 2.b 3.b 4.b 5.a 6.a 7.abde 8.abdf 9.e 10.c 11.c 12.b 13.a 14.c
//15.a 16.d 17c 18.ab 19.a 20.c 21.c 22.a 23.a 24.c 25.a