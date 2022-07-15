package bai_tap;

import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào USD:");
        double usd = scanner.nextDouble();
        double change = usd * 23000;
        System.out.print(usd + " USD" + " = " + change + " VND");
    }
}
