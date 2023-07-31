package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("src\\SerializationDeserialization\\ser.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s = (Student)in.readObject();
//           System.out.println(s.name+""+s.address);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
