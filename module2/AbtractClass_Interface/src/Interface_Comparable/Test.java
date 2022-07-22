package Interface_Comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);
Circle h1 = new Circle();
Circle h2 = new ComparableCircle();
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }

    }
}
