import java.io.*;

public class IoExceptionTest {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("/home/tomasz/IdeaProjects/01_projekty_Java/JavaStart/ExceptionExample/ExceptionExample1.txt")));
        }catch (FileNotFoundException e1){
            e1.printStackTrace();
        }

        try {
            br.readLine();
        }catch (IOException e){
            System.out.println("bład odczytu pliku");
        }
    }
}
