import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReading {
    
    public static void main (String[] args){
        File s = new File("main.txt");

        try{
            Scanner a = new Scanner(s);

            while (a.hasNextLine()) {
                System.out.println(a.nextLine());
            }
            a.close();

        } catch(IOException e){
            System.out.println("Nag error siya!");
        }

    }
}
