package Circle;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Cricle cr = new Cricle(2);
        System.out.print("Bán kính hình tròn: "+cr.getRadius());
        System.out.print("\nDiện tích hình tròn: "+cr.getArea());
    }
}
