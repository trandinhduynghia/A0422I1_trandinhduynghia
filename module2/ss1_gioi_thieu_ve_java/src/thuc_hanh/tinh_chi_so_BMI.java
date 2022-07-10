package thuc_hanh;
import java.util.Scanner;
public class tinh_chi_so_BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập vào cân nặng:");
        weight = scanner.nextDouble();
        System.out.print("Nhập vào chiều cao:");
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height, 2);
        if(bmi < 18){
            System.out.printf("%-20.2f%s", bmi,  "Thiếu cân");
        }else if(bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi, "Vừa người");
        }else if(bmi < 30.0){
            System.out.printf("%-20.2f%s", bmi, "Mập");
        }else{
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
        }

    }

}
