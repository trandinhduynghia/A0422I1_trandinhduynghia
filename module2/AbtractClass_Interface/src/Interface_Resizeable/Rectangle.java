package Interface_Resizeable;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Chiều dài: " + getHeight() + " Chiều rộng: " + getWidth() + super.toString();
    }

    public void resize(double percent) {
        this.width *= (percent / 200);
        this.width *= (percent / 200);
    }
}
