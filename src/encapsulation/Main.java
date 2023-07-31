package encapsulation;

public class Main {
    public static void main(String[] args) {
    Employee emp1=new Employee("esther",1,"goldhunga");
        System.out.println(emp1.getName());
        emp1.setName("essie");
        System.out.println(emp1.getName());
        System.out.println(emp1.getCompanyName());


    }
}
