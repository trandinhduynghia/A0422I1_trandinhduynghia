package Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5;
    String color = "blue";
    public Fan(){

    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String string = "";
        if(this.isOn()){
            string += ("Speed:" + this.speed + " Color: "+ this.color+" Radius: "+this.radius+" Fan is on");

        }else{
            string += ("Color: "+ this.color+" Radius: "+this.radius+" Fan is off");
        }
        return string;
    }

}
