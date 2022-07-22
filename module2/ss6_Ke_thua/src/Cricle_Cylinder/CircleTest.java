package Cricle_Cylinder;

import java.util.concurrent.Callable;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle(2, "red");
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
