import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) {

        System.out.println("Bomba skonstuowana za pomoca petli while");
        System.out.println("Podaj czas do wybuchu bomby ");
        Scanner scanner = new Scanner(System.in);
        int czasWybuchu = scanner.nextByte();
        System.out.println("Programuje czas wybuchu: " + czasWybuchu);
        System.out.println("Bomba wybuchnie za: ");

        int i = czasWybuchu;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("K BUUUM");


        System.out.println();
        System.out.println("Bomba skonstuowana za pomoca petli while do");
        System.out.println("Podaj czas do wybuchu bomby ");
        Scanner czas = new Scanner(System.in);
        int k = czas.nextByte();
        System.out.println("Programuje czas wybuchu: " + k);
        System.out.println("Bomba wybuchnie za: ");

        do {
            System.out.println(k);
            k--;
        }
        while (k > 0);
        System.out.println("K BUUUM");


        System.out.println();
        System.out.println("Bomba skonstuowana za pomoca petli fori");
        System.out.println("Podaj czas do wybuchu bomby ");
        Scanner tik = new Scanner(System.in);

        System.out.println("Bomba wybuchnie za: ");

        for (int g = tik.nextByte(); g > 0; g--) {
            System.out.println(g);

        }
        System.out.println("K BUUUM");
    }

}


