package thuc_hanh;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều rộng:");
        double width = scanner.nextDouble();
        System.out.print("Nhập vào chiều dài:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích HCN là:"+rectangle.getArea());
        System.out.println("Chu vi HCN là:"+rectangle.getPerimeter());
    }
}
