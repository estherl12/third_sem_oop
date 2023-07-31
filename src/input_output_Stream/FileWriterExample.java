package input_output_Stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterExample {
    public static void main(String[] args) {
        String data = "We are writing data into output.txt";
        try{
            Writer output = new FileWriter("src\\input_output_Stream\\output.txt");
            output.write(data);
            output.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
