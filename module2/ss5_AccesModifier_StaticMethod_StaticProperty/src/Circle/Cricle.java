package Circle;

public class Cricle {
    private double radius = 1;
    private String color = "red";
    Cricle (){

    }
    Cricle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
