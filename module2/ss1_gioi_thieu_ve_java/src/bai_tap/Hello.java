package bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên:");
        String name = scanner.nextLine();
        System.out.print("Xin chào! " + name);
    }
}
