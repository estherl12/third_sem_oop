import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        float p,c,b,m,cp;
        float percent , grade ;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of phy:");
        p=sc.nextFloat();
        System.out.println("Enter the marks of bio");
        b=sc.nextFloat();
        System.out.println("Enter the marks of computer");
        cp=sc.nextFloat();
        System.out.println("Chemistry");
        c=sc.nextFloat();
        System.out.println("Math");
        m= sc.nextFloat();

        percent=p*b*c*m*cp/500 ;
        if(percent>90){
            System.out.println("grade A");
        }
        else if (percent<90&&percent>=80) {
            System.out.println("grade B");
        }
        else if (percent<80&&percent>=70) {
            System.out.println("grade C");
        }
        else if (percent<70&&percent>=60) {
            System.out.println("grade D");
        }
        else {
            System.out.println("grade A");
        }

    }
}
