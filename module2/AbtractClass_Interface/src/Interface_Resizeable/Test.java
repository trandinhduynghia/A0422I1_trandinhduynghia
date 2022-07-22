package Interface_Resizeable;

public class Test {
    public static void main(String[] arg) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "yellow", false);
        shapes[1] = new Rectangle(6, 4, "red", true);
        shapes[2] = new Square(7, "blued", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            shape.resize(Math.random() * 1000);
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
