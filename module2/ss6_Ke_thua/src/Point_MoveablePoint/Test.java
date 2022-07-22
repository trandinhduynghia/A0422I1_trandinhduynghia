package Point_MoveablePoint;

public class Test {
    public static void main(String[] args){
        Point point = new Point(20,30);
        System.out.print(point.toString());
        point.speak();

        MovablePoint movablePoint = new MovablePoint(10, 20);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());




    }
}
