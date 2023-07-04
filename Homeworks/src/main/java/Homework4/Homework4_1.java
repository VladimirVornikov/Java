package main.java.Homework4;
import java.util.Scanner;
import java.util.Random;
public class Homework4_1 {
    public static void main(String[] args) {
//        nearestNum();
        secondsToTime();
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
//            String period;
//            if (subHours>12) {
//                period = " P.M";
//            } else {
//                period =" A.M";
//            }
            if (hours > 4) {
                System.out.println("Сейчас "+ subHours +":" +subMinute +
                        ":" + subSeconds +". А значит, осталось " + hours + " часов " + minutes + " минут " +  seconds +
                        " секунды до конца рабочей смены! ^_^");
            }else if (hours > 2) {
                System.out.println("Сейчас " + subHours + ":" + subMinute +
                        ":" + subSeconds +  ". А значит, осталось " + hours + " часа " + minutes + " минут " + seconds +
                        " секунды до конца рабочей смены! ^_^");
            } else  {
                System.out.println("Сейчас "+(timeDefaultHours-hours) +":" +(timeDefaultMinutes-minutes) +
                        ":"+ (timeDefaultSeconds-seconds) +". А значит, остался " + hours + " час " + minutes + " минут " +  seconds +
                        " секунды до конца рабочей смены! ^_^");

            }
        }
}