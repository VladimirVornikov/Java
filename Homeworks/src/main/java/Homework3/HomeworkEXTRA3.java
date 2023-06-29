package main.java.Homework3;
import java.util.Scanner;
public class HomeworkEXTRA3 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        double sum = addition(num1, num2);
        System.out.println("Cумма будет " + sum);
        double subtraction = subtract(num1, num2);
        System.out.println("Разность будет " + subtraction);
        double mul = multi(num1, num2);
        System.out.println("Произведение будет " + mul);
        double div = divide(num1, num2);
        System.out.println("Частное будет " + div);

        }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multi(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num1 != 0 && num2 !=0) {

            return num1 / num2;

        } else {
            System.err.println("Error: Division by zero ");
            return 0;
        }

    }

}
