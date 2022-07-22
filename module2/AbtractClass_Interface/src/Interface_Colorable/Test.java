package Interface_Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square();
        shape[1] = new Square(5, "red", true);
        for (Shape shape1 : shape) {
            System.out.println(shape1);
            if (shape1 instanceof Colorable) {
                ((Colorable) shape1).howToColor();
            }
        }
    }
}
