package SerializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name ;
    private int roll_no ;
    private String address;
    public Student(String name, int roll_no ,String address){
        this.address = address;
        this.name = name ;
        this.roll_no = roll_no;
    }
}
