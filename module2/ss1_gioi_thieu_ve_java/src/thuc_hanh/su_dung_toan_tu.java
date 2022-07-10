package thuc_hanh;
import java.util.Scanner;
public class su_dung_toan_tu {
    public static void main(String[] args){
        float rong;
        float dai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        rong = scanner.nextFloat();
        System.out.println("Nhập vào chiều dài");
        dai = scanner.nextFloat();
        float dienTich = rong * dai;
        System.out.println("Diện tích HCN: "+ dienTich);
    }
}
