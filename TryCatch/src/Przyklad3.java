import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Przyklad3 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    private static void run() throws IOException {
        File file = new File("test2.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("to jest tylko test");
        writer.close();
    }

}


