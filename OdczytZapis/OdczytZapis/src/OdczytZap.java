import java.io.*;
import java.util.Scanner;

public class OdczytZap {
    public static void main(String[] args) throws IOException {

        //odczyt z pliku
        System.out.println("odczyt z pliku");
        File plik2 = new File("plik2.txt");
        boolean istnieje = plik2.exists();
        System.out.println("Czy istnjeje plik2.txt: " + istnieje);
        String sciezka = plik2.getAbsolutePath();
        System.out.println("plik znajduje sie w: "  + sciezka);

        Scanner scanner = new Scanner(plik2);
        while (scanner.hasNext())
             {
                System.out.println(scanner.nextLine());
            }

        System.out.println();
        System.out.println("tworzenie pliku:");

        //tworzenie pliku
        File plik3 = new File("plik3.txt");
        boolean czyUtworzony = plik3.createNewFile();
        System.out.println("czy udało sie utworzyc plik plik3.txt: "+ czyUtworzony);
        boolean czyIstnijePlik3 = plik3.exists();
        System.out.println("plik3.txt juz istnieje: "+ czyIstnijePlik3);
        PrintWriter writer = new PrintWriter(plik3);
        for (int i = 0; i < 150000; i++) {
            writer.print('c');
        }
        writer.close();


    }
}
