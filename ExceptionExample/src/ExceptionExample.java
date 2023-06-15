import java.io.*;

public class ExceptionExample {
    public static void main(String[] args) {


        File fileExampleException = new File("/home/tomasz/IdeaProjects/01_projekty_Java/JavaStart/ExceptionExample/ExceptionExample1.txt");

        try {
            FileReader fileReader = new FileReader(fileExampleException);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.lines().forEach(System.out::println);
            bufferedReader.close();

            } catch (FileNotFoundException e) {
                System.err.println("File does not exist");
            } catch (IOException e) {
                System.err.println("File exist but there wos IOExcepiom");
            }

        }
    }


