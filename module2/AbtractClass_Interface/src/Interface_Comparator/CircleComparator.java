package Interface_Comparator;

import Interface_Comparable.Circle;

import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
