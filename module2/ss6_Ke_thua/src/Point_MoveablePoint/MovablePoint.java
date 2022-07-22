package Point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed = 0;
    private float ySpeed = 0;
    public MovablePoint(){

    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] test = new float[2];
        test[0] = this.xSpeed;
        test[1] = this.ySpeed;
        return test;
    }
    public String toString(){
        return "x là: "+getSpeed()+" y là: "+getySpeed()+getSpeed();
    }
    public Point move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}
