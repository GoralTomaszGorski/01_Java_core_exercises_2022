import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("podaj liczbe: ");
        try {
            double liczba = scanner.nextDouble();
            System.out.println(" twoja liczba to: "+liczba);
            scanner.close();
        }catch (InputMismatchException e){
            System.out.println("podałes nie prawidłowe dane: ");
        }



    }
}
