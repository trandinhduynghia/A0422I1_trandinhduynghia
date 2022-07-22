package Point;

public class Point2D {
    private float x = 0;
    private float y = 0;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] test = new float[2];
        test[0] = this.x;
        test[1] = this.y;
        return test;
    }


    public String toString() {
        return "x là: " + this.x + " y là: " + this.y;
    }
}
