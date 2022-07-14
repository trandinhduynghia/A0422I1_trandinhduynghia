package bai_tap;

import java.util.Scanner;

public class Show_20_First_Prefix {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == numbers) {
                break;
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
            return check;
        } else {
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            return check;
        }
    }
}
