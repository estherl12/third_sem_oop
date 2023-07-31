//import java.util.Scanner;
//
////to find maximum number between two numbers
//public class GreatestNumber {
//    public static void main(String[] args) {
//    int a,b;
//    Scanner sc= new Scanner(System.in);
//    System.out.println("Enter the first Number:");
//    a=sc.nextInt();
//
//    System.out.println("Enter the Second Number:");
//    b=sc.nextInt();
//
//    if(a>b)
//        System.out.println("The first number is greater "+a);
//    else
//        System.out.println("The second is greater "+b);
//    }
//}

import java.util.Scanner;

//WAP to find greatest among three numbers
public class   GreatestNumber {
    public static void main(String[] args) {
        int a,b,c,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();

        System.out.println("Enter the first number:");
        b=sc.nextInt();

        System.out.println("Enter the first number:");
        c=sc.nextInt();
        x=(a>b)?a:b;
        y=(c>x)?c:x;

        System.out.println("The greatest number among three number is "+y);

    }
}
