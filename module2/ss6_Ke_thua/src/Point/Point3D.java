package Point;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {

    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] test = new float[3];
        test[0] = this.z;
        test[0] = this.z;
        test[0] = this.z;
        return test;

    }

    public String toString() {
        return "z là: " + this.z + " " + super.toString();
    }
}
