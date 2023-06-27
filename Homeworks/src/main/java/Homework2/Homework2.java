package main.java.Homework2;

public class Homework2 {
    public static void main(String[] args) {
        String newString = new String("I study Basic Java"); // Метод, который принимает в качестве параметра строку
        System.out.println(newString.charAt(newString.length()-2));// Отображение пред-последнего символа строки.
        System.out.println(newString.contains("Java")); // Наличие слова Java в строке.
        System.out.println(newString.substring(14)); // Отрезок Java c помощью индексов.
        System.out.println(newString.replace("a","o")); // Замена а на о.
        System.out.println(newString.toUpperCase()); // Преобразование строки к верхнему регистру.
        System.out.println(newString.toLowerCase()); // Преобразование строки к нижнему регистру.
    }
}
