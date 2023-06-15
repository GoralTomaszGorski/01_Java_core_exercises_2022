import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {

        Scanner cyfra = new Scanner(System.in);
        System.out.println("podaj liczby typu double ");
        double a = cyfra.nextDouble();
        double b = cyfra.nextDouble();

        double dodawanie = a+b;
        double dzielenie = a/b;
        double mnozenie = a*b;

        System.out.println("wyniki" +
                "dodawanie "+ dodawanie + " dzielenie a/b "+ dzielenie+" mnozenie "+ mnozenie);
    }
}
