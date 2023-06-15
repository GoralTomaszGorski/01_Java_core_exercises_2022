import java.util.Scanner;
import java.math.BigDecimal;

public class PorownanieLiczb {
    public static void main (String[] args) {

        Scanner zasysacz = new Scanner(System.in);


        System.out.println("podaj pierwsza liczbe");
        int a = zasysacz.nextByte();

        System.out.println("podaj druga liczbe");
        int b = zasysacz.nextByte();

        if (a > b) {
            System.out.println("a wieksze od b");
        }
        else if (a == b) {
            System.out.println("a = b");
        }
        else {
                System.out.println("a mniejsze od b");
        }
    }
}
