package bai_tap;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidScore;
        do {
            System.out.print("\nNhập vào cấp ma trận vuông:");
            n = scanner.nextInt();
            isInvalidScore = n < 2;
            if (isInvalidScore) {
                System.out.print("Cấp ma trận phải lớn hơn hoặc bằng 2!");
            }
        } while (isInvalidScore);
        int arr[][] = new int[n][n];
        enterArray(arr, n);
        outputArray(arr, n);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Tổng các số ở đường chéo ma trận vuông: " + sum);
    }

    public static void enterArray(int arr[][], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\nNhập vào phần tử " + i + " " + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void outputArray(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
