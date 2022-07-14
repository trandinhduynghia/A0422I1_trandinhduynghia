package bai_tap;
import java.util.Scanner;
public class Add_Element_To_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, number, index;
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
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\nNhập vào số bạn cần chèn: ");
        number = scanner.nextInt();
        System.out.print("Nhập vào vị trí bạn cần chèn: ");
        index = scanner.nextInt();
        for(int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        n ++;
        System.out.print("Mảng sau khi chèn:");
        xuatMang(arr);
    }
    private static void nhapMang(int n,int arr[]){
        Scanner scanner = new Scanner(System.in);
        boolean isInvalidScore;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng:");
            n = scanner.nextInt();

            isInvalidScore = n < 0;
            if (isInvalidScore) {
                System.out.print("Số lượng phần tử phải lớn hơn 0!");
            }
        } while (isInvalidScore);
        //int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ":");
            arr[i] = scanner.nextInt();
        }
    }
    private static void xuatMang(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
