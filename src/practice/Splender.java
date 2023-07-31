package practice;
class Splender extends Bike{


    Splender(int cost, String rang) {
        super(cost, rang);

    }

    public void speed(){
        System.out.println("I have a medium speed");
    }
    public static void main(String[] args) {
        Splender s = new Splender(500,"Red");
        Bike s1 = new Splender(400 , "red");
        s1.speed();
    }

}
