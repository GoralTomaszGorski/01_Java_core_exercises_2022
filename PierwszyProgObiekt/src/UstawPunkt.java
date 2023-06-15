import java.util.Scanner;

public class UstawPunkt {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();

        Scanner scanx = new Scanner(System.in);
        System.out.println("podaj pkt x: ");
        punkt.UstawX(scanx.nextInt());

        Scanner scany = new Scanner(System.in);
        System.out.println("podaj pkt y: ");
        punkt.UstawY(scany.nextInt());

        System.out.println("Współrzedne X Y to kolejno: "+punkt.dajX()+" "+ punkt.dajY());

    }
}
