package main.java.Homework8;
import java.util.Arrays;

public class Homework8_1 {
        public static int getMissingNumber(int[] arr) {
            int n = arr.length;
            int m = n + 1;
            int total = m * (m + 1) / 2;
            int sum = Arrays.stream(arr).sum();
            return total - sum;
        }

        public static void main(String[] args) {
            int[] array1 = {1,2,3,5};
            int[] array2 = {6,1,2,8,3,4,7,10,5};
            int[] array3 = {1,3,6,7,9,8,5,4};

            System.out.println("The missing number is " + getMissingNumber(array1));
            System.out.println("The missing number is " + getMissingNumber(array2));
            System.out.println("The missing number is " + getMissingNumber(array3));
        }
}




