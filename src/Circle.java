//Assignment-3
//Q.N 1
public class Circle {
    private double radius = 1.0 ;
    private static String color = "red";

    private double area  ;
    {
    area = Math.PI*radius*radius ;
    }
    private double circumference ;

    Circle(){
        System.out.println("Am a circle");
    }
    Circle(double radius){
        this.radius = radius ;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea(){
        return area;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
