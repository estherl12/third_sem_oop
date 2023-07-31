package SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) {
       try {
            Student s1 = new Student("Esther", 1, "goldhunga");
            FileOutputStream fout = new FileOutputStream("src\\SerializationDeserialization\\ser.txt");
           ObjectOutputStream out =new  ObjectOutputStream(fout);
           out.writeObject(s1);
           out.flush();
           System.out.println("Serialization Successfull!");
        } catch(Exception e){
           e.getStackTrace();
       }
    }
}
