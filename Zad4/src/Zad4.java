import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        int a;
        short b;

        Scanner scanner = new Scanner(System.in);


        System.out.println("podaj liczbe 1");
        a = scanner.nextInt();
        System.out.println("podaj liczbe 2");
        b = scanner.nextShort();


        if (a > b) {
            System.out.println("1 liczba wieksza od 2");
        } else if (a < b) {
            System.out.println("1 liczba mniejsza od 2");
        } else {
            System.out.println("liczby sa rowane");
        }

    }

}
