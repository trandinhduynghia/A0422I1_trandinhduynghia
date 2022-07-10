package thuc_hanh;
import java.util.Scanner;
public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double money = 1;
        int month = 1;
        double interesRate = 1;
        System.out.print("Mời bạn nhập số tiền:");
        money = scanner.nextDouble();
        System.out.print("Mời bạn nhập vào tháng:");
        month = scanner.nextInt();
        System.out.print("Mời bạn nhập vào tháng:");
        interesRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interesRate/100)/12 * month;
        }
        System.out.print("Số tiền lãi của bạn là:" + totalInterest);
    }
}
