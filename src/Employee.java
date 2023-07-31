//Assignment3
//QN.3
public class Employee {
    private int id;
    private String firstName;
   private String lastName;
    int Salary;


    public Employee(int id, String firstName, String lastName, int Salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Salary = Salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public int getAnnualSalary(){
        return Salary*12;
    }
    public int raiseSalary(int percent){
        return Salary+Salary*percent/100;
    }
    public String toString(){
        return "Employee[id = "+id+",name= "+firstName+lastName+",salary= "+Salary+"]";
    }

}
