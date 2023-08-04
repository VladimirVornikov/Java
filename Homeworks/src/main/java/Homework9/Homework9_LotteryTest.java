package main.java.Homework9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LotteryTest {

    @Test
    void testGenerateLuckyNumbers() {
        int setSize = 5;
        int range = 50;

        int[] luckyNumbers = Lottery.generateLuckyNumbers(setSize, range);

        Assertions.assertEquals(setSize, luckyNumbers.length, "Generated array size should match set size");

        for (int num : luckyNumbers) {
            Assertions.assertTrue(num >= 1 && num <= range, "Generated number should be within the specified range");
        }
    }

    @Test
    void testCalculateMatches() {
        int[] luckyNumbers = { 10, 20, 30, 40, 50 };
        int[] userNumbers = { 5, 10, 15, 20, 25 };

        int expectedMatches = 2; // 10 and 20 are matching
        int actualMatches = Lottery.calculateMatches(luckyNumbers, userNumbers);

        Assertions.assertEquals(expectedMatches, actualMatches, "Number of matches should be calculated correctly");
    }
}

public class UtilsTest {

    @Test
    void testAddNumbers() {
        int a = 5;
        int b = 10;
        int expectedSum = 15;
        int actualSum = Utils.addNumbers(a, b);

        Assertions.assertEquals(expectedSum, actualSum, "Sum of two numbers should be calculated correctly");
    }

    @Test
    void testCapitalize() {
        String inputStr = "hello";
        String expectedStr = "Hello";
        String actualStr = Utils.capitalize(inputStr);

        Assertions.assertEquals(expectedStr, actualStr, "String should be capitalized correctly");
    }
}
