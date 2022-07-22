package Cricle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public  Cylinder(){

    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getRadius() * getRadius() * height * Math.PI;
    }
    public String toString(){
        return "Chiều cao: "+ getHeight()+ " " + super.toString();
    }
}
