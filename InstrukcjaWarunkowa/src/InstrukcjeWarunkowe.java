import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        System.out.println("wybierz bramke 1, 2 lub 3");

        Scanner scanner = new Scanner(System.in);
        int bramka = scanner.nextInt();

        if (bramka == 1){
            System.out.println("Garnki");
        } else if (bramka == 2) {
            System.out.println("ZONK");
        } else if (bramka == 3) {
            System.out.println("samochod");
        } else {
            System.out.println("nie prawidłowa bramka");
        }




    }
}
