package bai_tap;

import java.util.Scanner;

public class Merge_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        boolean isInvalidScore;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng 1:");
            n1 = scanner.nextInt();

            isInvalidScore = n1 < 0;
            if (isInvalidScore) {
                System.out.print("Số lượng phần tử phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        int arr1[] = new int[n1];
        enterArray(arr1,n1);
        outputArray(arr1,n1);
        do {
            System.out.print("\nNhập vào số lượng phần tử của mảng 2:");
            n2 = scanner.nextInt();

            isInvalidScore = n2 < 0;
            if (isInvalidScore) {
                System.out.print("Số lượng phần tử phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        int arr2[] = new int[n2];
        enterArray(arr2,n2);
        outputArray(arr2,n2);
        int c = arr1.length + arr2.length;
        int[] arr = new int[c];
        int pos = 0;
        for (int element : arr1) {
            arr[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            arr[pos] = element;
            pos++;
        }
        System.out.print("\nMảng sau khi gộp:");
        outputArray(arr,c);
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
