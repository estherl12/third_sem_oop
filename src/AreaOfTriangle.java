import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float base , height,area ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of triagle");
        base =sc.nextFloat();

        System.out.println("Enter the Height of triagle");
        height =sc.nextFloat();

        area =base*height/2;

        System.out.println("The area of a triangle is "+area);

    }
}
