import java.util.Scanner;

public class QuadEquat {
    public static void main(String[] args) {

      double descriminant;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        descriminant=b*b-4*a*c;
        if(descriminant>0){
            double root1 = (-b+Math.sqrt(descriminant))/(2*a);
            double root2 = (-b-Math.sqrt(descriminant))/(2*a);
            System.out.println("The roots are"+root1+"and"+root2);
        } else if (descriminant==0) {
          double root = (-b)/(2*a);
            System.out.println("The roots are eual and is"+root);
        }
        else {
            System.out.println("the roots are not real.");
        }

    }
}
