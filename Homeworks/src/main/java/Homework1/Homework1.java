package Homework1;

public class Homework1 {
    public static void main(String[] args) {
        char myChar = 'G';
        int myInt = 89;
        byte myByte = 4;
        short myShort = 56;
        float myFloat = 4.7333436F;
        double myDouble = 4.355453532;
        long myLong = 1212;

        System.out.println("Character: " + myChar);
        System.out.println("Integer: " + myInt);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Long: " + myLong);

        // Задание co звездочкой
        int number = 345;
        String number_Str = Integer.toString(number);
        for (int i =0; i<number_Str.length(); i++) {
            System.out.print(number_Str.charAt(i));
            if (i != number_Str.length()-1) {
                System.out.print(",");
        }
     }
    }
}
