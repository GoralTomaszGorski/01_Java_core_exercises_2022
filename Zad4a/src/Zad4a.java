import java.util.Scanner;

public class Zad4a {
    public static void main(String[] args){
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj 1 liczbe: ");
        a = scanner.nextInt();
        System.out.println("podaj 2 liczbe: ");
        b = scanner.nextInt();

        if (a>b) {
            System.out.println("1 liczba wieksza od 2");
        }
        else if (a<b) {
            System.out.println("1 liczba mniejsza od 2");
        }
        else{
            System.out.println("liczby rowne");

        }
    }

}
