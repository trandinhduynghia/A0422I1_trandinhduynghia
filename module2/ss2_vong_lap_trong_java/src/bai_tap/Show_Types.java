package bai_tap;

import java.util.Scanner;

public class Show_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chũ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở phía dưới bên trái");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở phía trên bên trái");
            System.out.println("4. Inh ình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Mời bạn nhập số: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn không chọn số phù hợp!");
            }
        }
    }
}

