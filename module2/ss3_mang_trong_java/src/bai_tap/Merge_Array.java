package bai_tap;

import java.util.Scanner;

public class Merge_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n1, n2;
        do {
            //System.out.print("Số lượng phần tử phải lớn hơn 0!");
            System.out.print("Nhập vào số phần tử của mảng 1:");
            n1 = scanner.nextInt();
        } while (n1 <= 0);
        int arr1[] = new int[n1];
        for (i = 0; i < n1; i++) {
            System.out.print("\nNhập vào phần tử thứ " + i + ":");
            arr1[i] = scanner.nextInt();
        }
        for (i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + "\t");
        }
        do {
            //System.out.print("Số lượng phần tử phải lớn hơn 0!");
            System.out.print("\nNhập vào số phần tử của mảng 2:");
            n2 = scanner.nextInt();
        } while (n2 <= 0);
        int arr2[] = new int[n2];
        for (i = 0; i < n2; i++) {
            System.out.print("\nNhập vào phần tử thứ " + i + ":");
            arr2[i] = scanner.nextInt();
        }
        for (i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + "\t");
        }
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
        for (i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
