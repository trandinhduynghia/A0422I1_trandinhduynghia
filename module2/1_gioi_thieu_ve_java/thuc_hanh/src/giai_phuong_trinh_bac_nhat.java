import java.util.Scanner;
public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args){
        System.out.println("Giải phương trình bậc nhất a*x + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c:");
        double c = scanner.nextDouble();
        if(a != 0){
            double nghiem = (c-b) / a;
            System.out.println("Nghiệm là: "+ nghiem);
        }else {
            if(b == c){
                System.out.println("Vô số nghiệm");
            }else {
                System.out.println("Vô nghiệm");
            }
        }
    }
}
