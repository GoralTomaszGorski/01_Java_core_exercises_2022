import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("wybierz bramke 1, 2 lub 3");

        Scanner scanner = new Scanner(System.in);
        int bramka = scanner.nextInt();


        switch (bramka){
            case 1:
                System.out.println("ZONK!");
                break;
            case 2:
                System.out.println("Fiat 125p");
                break;
            case 3:
                System.out.println("Garnki");
                break;
            default:
                System.out.println("Niepoprawna bramka");

        }
    }
}
