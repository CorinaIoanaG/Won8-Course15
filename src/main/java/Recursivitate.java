import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Recursivitate {
    public static Map<Integer, Long> result = new HashMap<>();

    public static void main(String[] args) {
        String s1 = "madam";
        System.out.println(String.format("Sum of first %d numbers is %d", 15, sumOfNumbers(15)));
        System.out.println(String.format("Sum of first %d even numbers is %d", 8, sumOfEvenNumbers(8)));
        System.out.println(String.format("The word %s is a palindrome: %b", s1, s1.equals(checkPalindromeReversString(s1))));
        System.out.println(String.format("The word %s is a palindrome: %b", s1, checkPalindromeFirstLastCheck(s1)));
        System.out.println(String.format("Sum of digits for number %d is %d", 15057, sumOfDigits(15057)));
        System.out.println(String.format("The %d element from Fibonaccy Array is %d", 10, fibonacci(10)));

    }

    private static long sumOfNumbers(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return i + sumOfNumbers(i - 1);
    }

    private static long sumOfEvenNumbers(int i) {
        if (i < 2) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i % 2 == 0) {
            return i + sumOfEvenNumbers(i - 2);
        }
        return i - 1 + sumOfEvenNumbers(i - 3);
    }

    private static String checkPalindromeReversString(@NotNull String word) {
        if (word.length() == 1) {
            return word;
        }
        return word.charAt(word.length() - 1) + checkPalindromeReversString(word.substring(0, word.length() - 1));
    }

    private static boolean checkPalindromeFirstLastCheck(@NotNull String word) {
        if (word.length() == 1) {
            return true;
        }
        if (word.length() == 2) {
            return word.charAt(0) == word.charAt(word.length() - 1);
        }
        return word.charAt(0) == word.charAt(word.length() - 1) && checkPalindromeFirstLastCheck(word.substring(1, word.length() - 1));
    }

    private static long sumOfDigits(long i) {
        if (i < 0) {
            return sumOfDigits(-i);
        }
        if (i < 10 && i >= 0) {
            return i;
        }
        return Math.floorMod(i, 10) + sumOfDigits((long) Math.floor(i / 10));
    }

    private static long fibonacci(Integer i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        if (result.containsKey(i)) {
            return result.get(i);
        }
        long element = fibonacci(i - 1) + fibonacci(i - 2);
        result.put(i, element);
        return element;
    }


}
