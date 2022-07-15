package bai_tap;

import java.util.Scanner;

public class ReadNumbersIntoLetters {
    public static String unit(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    public static String dozen(int number) {
        switch (number) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
        }
        return "";
    }

    public static String dozen2(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Mời bạn nhập số: ");
        int number = scanner.nextInt();
        String number1 = null;
        if (number >= 0 && number < 10) {
            number1 = unit(number);
        } else if (number < 20) {
            int onesDigit = number % 10;
            number1 = dozen(onesDigit);
        } else if (number < 100) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            number1 = dozen2(tensDigit);
            if (onesDigit != 0)
                number1 += " " + unit(onesDigit);
        } else if (number < 1000) {
            int hundredsDigit = number / 100;
            int tensDigit = (number - hundredsDigit * 100) / 10;
            int onesDigit = number % 10;
            number1 = unit(hundredsDigit) + "hundred";
            if (tensDigit == 0) {
                if (onesDigit != 0)
                    number1 += " and " + unit(onesDigit);
            } else if (tensDigit == 1) {
                number1 += " and " + dozen(onesDigit);
            } else {
                number1 += " and " + dozen2(tensDigit);
                if (onesDigit != 0) {
                    number1 += " " + unit(onesDigit);
                }
            }
        }
        System.out.printf(number1);
    }
}
