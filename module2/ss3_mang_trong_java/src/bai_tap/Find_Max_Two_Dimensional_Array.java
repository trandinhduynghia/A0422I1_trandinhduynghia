package bai_tap;
import java.util.Scanner;
public class Find_Max_Two_Dimensional_Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int line, column;
        do{
            System.out.print("Nhập vào số dòng:");
            line = scanner.nextInt();
            System.out.print("Nhập vào số cột:");
            column = scanner.nextInt();
        }while (line < 1 || column <1);

        int arr[][] = new int[line][column];
        for(int i = 0; i < line; i++){
            for(int j = 0; j < column; j++){
                System.out.print("Nhập vào phần tử "+i+" "+j+":");
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < line; i++ ){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int max = arr[0][0];
        int vt;
        for(int i = 0; i < line; i++ ){
            for(int j = 0; j < column; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phần tử lớn nhất trong mảng 2 chiều:"+max);
        for(int i = 0; i < line; i++ ){
            for(int j = 0; j < column; j++){
                if(arr[i][j] == max){
                    System.out.print("\nVị trí của phần tử lớn nhất: "+ i+" : "+j);
                }
            }
        }

    }
}
