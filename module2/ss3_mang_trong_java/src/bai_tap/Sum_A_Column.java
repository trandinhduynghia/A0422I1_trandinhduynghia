package bai_tap;

import java.util.Scanner;

public class Sum_A_Column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line, column, column1, sum = 0;
        boolean isInvalidScore;
        do {
            System.out.print("Nhập vào số dòng:");
            line = scanner.nextInt();
            System.out.print("Nhập vào số cột:");
            column = scanner.nextInt();
            isInvalidScore = line < 1 || column < 1;
            if (isInvalidScore) {
                System.out.print("Số lượng dòng và cột phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        int arr[][] = new int[line][column];
        enterArray(arr, line, column);
        outputArray(arr, line, column);
        System.out.print("Nhập vào cột: ");
        column1 = scanner.nextInt();
        for (int i = 0; i < line; i++) {
            sum += arr[i][column1];
        }
        System.out.print("Tổng các số trên cột thứ " + column1 + ":" + sum);
    }

    public static void enterArray(int arr[][], int line, int column) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập vào phần tử " + i + " " + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void outputArray(int arr[][], int line, int column) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
