public class Rectangle {
    private float length;
    private float width;

    private double Area;
    {
        Area=length*width;
    }
    private double perimeter;
    {
        perimeter=2*(length+width);
    }
    public Rectangle(){
        System.out.println("This is rectangle..");
    }
   public Rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }
    public void getLength(float length){
        this.length= length;
    }
    public float setLength(){
        return length;
    }
     public void getWidth(float width){
        this.width = width;
     }
     public float getWidth(){
        return width;
     }

     public void setArea(double Area){
        this.Area=Area;
     }
     public double getArea(){
        return Area;
     }
     public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
     }
     public double getPerimeter(){
        return perimeter;
     }
     public String toString(){
        return "Retangle[length = "+ length +",width = " +width+"]";
     }
}
