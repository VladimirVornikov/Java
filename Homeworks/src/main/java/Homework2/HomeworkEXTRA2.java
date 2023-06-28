package main.java.Homework2;
import java.util.Scanner;

public class HomeworkEXTRA2 {
    public static void main(String[] args) {
        Scanner myScannerInt1 = new Scanner(System.in);
        Scanner myScannerInt2 = new Scanner(System.in);
        int myInt1, myInt2;
        System.out.print("Input first number = ");
        myInt1 = myScannerInt1.nextInt();
        System.out.print("Input second number = ");
        myInt2 = myScannerInt2.nextInt();
        System.out.println("The result of addition will be " + (myInt1+myInt2));
        System.out.println("The result of subtraction will be " + (myInt1-myInt2));
        System.out.println("The result of multiplication  will be " + (myInt1*myInt2));
        if (myInt1 != 0 && myInt2 !=0) {

            System.out.println("The result of division will be " + (myInt1/myInt2));

        } else {
            System.err.println("Error: Division by zero ");
        }

            }
}
