package main.java.Homework3;
import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        String firstStr, secondStr;
        Scanner scanner = new Scanner(System.in);
        firstStr  = scanner.nextLine();
        secondStr = scanner.nextLine();
        System.out.println(firstStr.substring(0, firstStr.length()/2)+ secondStr.substring(secondStr.length()/2));

    }
}
