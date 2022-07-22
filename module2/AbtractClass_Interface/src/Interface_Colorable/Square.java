package Interface_Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {

    }

    public Square(double radius, String color, boolean filled) {
        super(color, filled);
        this.side = radius;
    }

    public double getRadius() {
        return side;
    }

    public void setRadius(double radius) {
        this.side = radius;
    }

    public double getArea() {
        return side * side;
    }

    public void howToColor() {
        System.out.println("Hình vuông tô 4 cạnh!");
    }

    public String toString() {
        return "Cạnh: " + getRadius() + " Diện tích: " + getArea() + super.toString();
    }

}
