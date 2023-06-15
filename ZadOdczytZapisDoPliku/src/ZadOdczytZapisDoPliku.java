import java.io.*;
import java.util.Scanner;

public class ZadOdczytZapisDoPliku {
    public static void main(String[] args) throws IOException {
        System.out.println("podaj imie");
        Scanner imie = new Scanner(System.in);
        String im = imie.nextLine();


        PrintWriter piszPan = new PrintWriter("pliczek1.txt");
        piszPan.print(im);
        piszPan.close();

        Scanner odczyt = new Scanner(new File("pliczek1.txt"));
        System.out.println(odczyt.nextLine());


        //
    }
}
