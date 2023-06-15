import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    public void log(String text) {
        try {
            File file = new File("logs.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(text+"\n");
            writer.close();

        }catch (IOException e){
            //ignoruj
        }


    }
}
