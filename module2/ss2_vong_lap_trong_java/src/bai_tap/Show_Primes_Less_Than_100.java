package bai_tap;

import java.util.Scanner;

public class Show_Primes_Less_Than_100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
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
