import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterProgram {
    public static void main (String[] args){

        File s = new File("main.txt");

        try {
            FileWriter a = new FileWriter(s);
            a.write("Bahala na!");
            a.close();
            System.out.println("Printed Successfully!");

        }catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }

    }
}
