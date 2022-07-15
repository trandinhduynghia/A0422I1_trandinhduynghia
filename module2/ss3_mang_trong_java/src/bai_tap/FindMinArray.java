package bai_tap;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidScore;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng:");
            n = scanner.nextInt();

            isInvalidScore = n < 0;
            if (isInvalidScore) {
                System.out.print("Số lượng phần tử phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        int arr[] = new int[n];
        enterArray(arr, n);
        outputArray(arr, n);
        minArray(arr);
    }

    public static void enterArray(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhập vào phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void minArray(int arr[]) {
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("\nPhần tử bé nhất trong mảng là: " + min);
    }
}
