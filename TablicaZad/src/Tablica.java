import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            {
                Scanner scan = new Scanner(System.in);
                String[] tabl = {scan.nextLine()};

                for (int k = 0; k < tabl.length; k++) {
                    System.out.println("witaj " + tabl[k]);

                }
            }
        }

        String[] tabl2 = new String[5];
        Scanner odczyt = new Scanner(System.in);

        for (int i = 0; i < tabl2.length; i++) {
            tabl2[i] = odczyt.nextLine();
        }
        for (int i = 0; i < tabl2.length; i++) {
            System.out.println("Witaj! "+ tabl2[i]);
        }


    }
}

