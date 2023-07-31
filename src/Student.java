import java.lang.reflect.Constructor;

class Student{
    String name;
    int roll_no;
    String add;
    static String college_name="Gp College";
//    Student(){
//        System.out.println("Default constructor.");
//    }
    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        System.out.println("Gp memorial college");
    }

    //Using methods
    public void initializing(int roll_no,String name){
        this.name=name;
        this.roll_no=roll_no;
    }
}
