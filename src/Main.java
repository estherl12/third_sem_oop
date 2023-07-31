//public class Main{
//    public static void main(String args[]){
//    int a,b,sub;
//
//    sub=a-b;
//        System.out.println("The subtraction of two number is "+sub);
//    }
//}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//      Student st=new Student("Esther",1);
//      Student st1=new Student();
//      Student st1=new Student("akash",2);
        Scanner sc=new Scanner(System.in);
//        System.out.println("Name");
//     st.name=sc.nextLine();
//
//     System.out.println("Roll no:");
//     st.roll_no=sc.nextInt();

//     System.out.println("Address:");
//     st.add=sc.nextLine();

//      System.out.println("Name:"+st.name);
//      System.out.println("Roll no:"+st.roll_no);
//      System.out.println("Address:"+st.add);
//
//      //After methods
//        st.initializing(1,"anish");
//        System.out.println("the name and roll_no is"+st1.name);
//        cow c = new cow(4);
//        System.out.println(c.leg);

        Circle c1 = new Circle();

        System.out.println("the area of circle is "+c1.getArea());

        Employee e1 = new Employee(1,"es","lama",10000);
        System.out.println(e1.getName());

    }
}
