package Interface_Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Bán kính: " + getRadius() + super.toString();
    }

    public void resize(double percent) {
        this.radius *= (percent / 200);
    }
}
