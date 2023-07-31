package input_output_Stream;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        char[] array = new char[100];
        try{
            FileReader input = new FileReader("src\\input_output_Stream\\input.txt");
            input.read(array);
            System.out.println("data in file:");
            System.out.println(array);
            input.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
