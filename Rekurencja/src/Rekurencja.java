import java.util.Scanner;

public class Rekurencja {

        public static void obliczRek (int  i){
        if (i > 0) {
            System.out.println(i);
            i--;
            obliczRek(i);

        }
    }
    public static void main(String[] args) {

            for (int i = 5; i > 0; i--) {
                System.out.println(i);
            }
        System.out.println("rekurencyjne ");
            obliczRek(5);

        }



    }


