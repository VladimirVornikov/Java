package main.java.Homework7;
import java.util.Random;
import java.util.Arrays;
public class Homework7 {
    public static void main(String[] args) {
    array1();
    array2();

    }
     static void array1() {
         Random rd = new Random();
         int[] arr = new int[8];

         for (int i=0; i<arr.length; i++) {
             arr[i] = rd.nextInt(49)+1;
         }
         System.out.println(Arrays.toString(arr));

         for (int i =0; i<arr.length; i++){
             if (arr[i] % 2 != 0) {
                 arr[i] = 0;
             }
         }

         System.out.println(Arrays.toString(arr));

     }
    static void array2() {
        Random rd = new Random();
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i] = rd.nextInt(89)+10;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("А этот массив отсортирован -> " + Arrays.toString(arr));

    }
}
