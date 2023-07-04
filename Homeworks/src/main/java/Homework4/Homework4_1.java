package main.java.Homework4;
import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
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
}