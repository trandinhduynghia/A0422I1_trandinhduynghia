package bai_tap;

import java.util.Scanner;

public class Remove_Element_From_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c, i, n;
        boolean isInvalidScore;
        do {
            System.out.print("Nhập vào số phần tử của mảng:");
            n = scanner.nextInt();
            isInvalidScore = n < 0;
            if (isInvalidScore) {
                System.out.print("Số lượng phần tử phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        int arr[] = new int[n];
        enterArray(arr, n);
        outputArray(arr, n);
        System.out.print("\nNhập vào số bạn muốn xóa:");
        int number = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
            if (arr[i] != number) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        enterArray(arr, n);
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
}

