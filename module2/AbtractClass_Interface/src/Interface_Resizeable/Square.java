package Interface_Resizeable;

public class Square extends Shape {
    private double side;

    public Square() {

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "Cạnh: " + getSide() + super.toString();
    }

    public double getArea() {
        return side * side;
    }

    public void resize(double pecent) {
        this.side *= (pecent / 200);
    }
}
