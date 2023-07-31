package practice;

public class Bike {
    private int price;
    private String color;
    Bike(int price,String color){
        this.price = price;
        this.color = color;
    }
    public void speed(){
        System.out.println("I am fast");
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(int price){
        return price;
    }
}
