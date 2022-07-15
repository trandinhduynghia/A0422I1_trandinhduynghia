package bai_tap;

import java.util.Scanner;

public class Count_Character_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Nhập vào chuổi:");
        name = scanner.nextLine();
        System.out.print("Chuổi là: " + name);
        char character;
        System.out.print("\nNhập vào kí tự:");
        character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == character) {
                count++;
            }
        }
        System.out.print("\nSố lần kí tự " + character + " xuất hiện trong chuỗi: " + count);
    }
}
