package org.example;

public class Main {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; 
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number == 0) {
            return words[0];
        }

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.insert(0, words[digit] + " ");
            number /= 10;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
