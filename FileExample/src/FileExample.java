import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException {

        //Pliki w Javie można utworzyć korzystając z podstawowej klasy File, np.:
        File file1 = new File("/home/tomasz/IdeaProjects/01_projekty_Java/JavaStart/FileExample/plik1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
//Od Javy 7 możemy skorzystać także z klasy Files:
        //Files nie File
        Files.createFile(Path.of("/home/tomasz/IdeaProjects/01_projekty_Java/JavaStart/FileExample/plik2.txt"));
        //Jeżeli plik już istnieje, rzucony zostaje wyjątek FileAlreadyExistsException.


        //Foldery tworzymy z pomocą klasy Files z podobny sposób jak pliki, jednak wykorzystujemy do tego celu metodę createDirectory().
        Files.createDirectory(Path.of("/home/tomasz/IdeaProjects/01_projekty_Java/JavaStart/FileExample/Przykładowy"));

        /*Wczytywanie pliku w aplikacji jest powtarzalną czynnością.
        Najczęściej tworzymy do tego celu BufferedReadera, wczytujemy plik wiersz po wierszu i coś z takim tekstem robimy.
        Istnieje jednak sposób na wczytanie pliku w całości, wykorzystujemy w tym celu metodę Files.readAllLines().
         */
        Files.readAllLines(Paths.get("/home/tomasz/Dokumenty/PlikDoTestow.txt"), Charset.forName("UTF-8"));
    }

}
