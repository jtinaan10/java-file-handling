import java.io.File;
import java.io.IOException;

class FileCreation{
     public static void main(String[] args) {
        
        File s = new File("main.txt");

        try {

            if (s.createNewFile()) {
                System.out.println("File is created!");
            }else{
                System.out.println("File is exiting already!");
            }
        } catch (IOException e){
            System.out.println("Saaaad");

        }
        

    }
}