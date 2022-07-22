package QuadraticEquantion;

public class QuadracticEquation {
    double a, b, c;

    public QuadracticEquation() {

    }

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }
}
