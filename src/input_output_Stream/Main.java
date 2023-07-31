package input_output_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[] bytearray = new byte[100];
        try{
            InputStream inputStream = new FileInputStream("src\\input_output_Stream\\input.txt");
            System.out.println("Available bytes:"+inputStream.available());
            int no = inputStream.read(bytearray);
            System.out.println(no);

            System.out.println("read data from file");
            String data = new String(bytearray);
            System.out.println(data);
            inputStream.close();

        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
