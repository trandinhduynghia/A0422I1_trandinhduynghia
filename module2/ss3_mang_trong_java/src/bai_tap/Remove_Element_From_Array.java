package bai_tap;

import java.util.Scanner;

//int index = 0;
//for(int i = 0; i <= arr.length - 1; i++){
//            //if(number != arr[i]){
//                //System.out.print("\nSố bạn nhập không có trong mảng");
//                //break;
//            //}
//            if (number == arr[i]) {
//                index = i;
//            }
//        }
//        int kichthuocthucte = arr.length;
//        for(int i = index; i <= arr.length - 1; i++){
//            arr[i] = arr[i+1];
//        }
//        kichthuocthucte --;
//
//        for(int i = 0; i < kichthuocthucte; i++ ){
//            System.out.print(arr[i]+"\t");
//       }
//int arr [];
//       arr = new int[]{1, 2, 3, 4, 5};
public class Remove_Element_From_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c, i, n;
        do{
            //System.out.print("Số lượng phần tử phải lớn hơn 0!");
            System.out.print("Nhập vào số phần tử của mảng:");
            n = scanner.nextInt();
        }while (n <= 0);
        int arr [] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("\nNhập vào phần tử thứ "+i+":");
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\nNhập vào số bạn muốn xóa:");
        int number = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (arr[i] != number) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        for (i = 0; i < n; i++) {
            //System.out.print("\nMảng sau khi xóa:");
            System.out.print(arr[i] + "\t");
        }
    }
}
