package thuc_hanh;

import java.util.Scanner;

public class Tim_Uoc_Chung_Lon_Nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Nhập vào a:");
        a = scanner.nextInt();
        System.out.print("Nhập vào b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.print("Ưóc chung lớn nhất của 2 số a và b: " + a);
    }
}
