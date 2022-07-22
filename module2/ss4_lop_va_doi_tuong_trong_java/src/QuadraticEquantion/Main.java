package QuadraticEquantion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình ax2 + bx + c = 0");
        System.out.println("Nhập và a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập và b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập và c:");
        double c = scanner.nextDouble();

        QuadracticEquation quadracticEquation = new QuadracticEquation(a, b, c);
        System.out.println("Phương trình có delta: " + quadracticEquation.getDiscriminant());
        if (quadracticEquation.getDiscriminant() > 0) {
            System.out.print("Phương trình có nghiệm x1: " + quadracticEquation.getRoot1());
            System.out.println("Phương trình có nghiệm x2: " + quadracticEquation.getRoot2());
        } else if (quadracticEquation.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm x1: " + quadracticEquation.getRoot1());
        } else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}
