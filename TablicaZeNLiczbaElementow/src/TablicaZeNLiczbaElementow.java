import java.util.Scanner;

public class TablicaZeNLiczbaElementow {
    public static void main(String[] args) {
        Scanner elementy = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow tablicy");
        int a = elementy.nextInt();
        int[] tablica = new int[a];

        Scanner cyfry = new Scanner(System.in);
        System.out.println("Podaj cyfry do tablicy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = cyfry.nextInt();
        }

        System.out.println("Wybrane cyfry to");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]+ " ");
        }
        System.out.println("liczby z tablicy za pomoca while");
        int b = 0;
        while (b<tablica.length){
            System.out.println(tablica[b]);
            b++;
        }

    }
}