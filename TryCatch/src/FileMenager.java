import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMenager {
    public static void main(String[] args) {

        File file = new File("test.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e){
            System.out.println("nie ma takiego pliku");
        }


    }
}
