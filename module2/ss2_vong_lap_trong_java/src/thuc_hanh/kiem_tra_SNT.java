package thuc_hanh;
import java.util.Scanner;
public class kiem_tra_SNT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số: ");
        int number = scanner.nextInt();
        if(number < 2){
            System.out.print(number+" không phải là SNT");
        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.print(number+" là SNT");
            else
                System.out.print(number+" không phải là SNT");
        }
    }
}
