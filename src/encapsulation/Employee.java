package encapsulation;

public class Employee {
    private String name;
    private int id;
    private String address;
    private static String companyName="Google";


    public Employee(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int id(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String setAddress(){
        return address;
    }

    public void getAddress(String address){
        this.address=address;
    }
    public static String getCompanyName(){
        return companyName;
    }
}
