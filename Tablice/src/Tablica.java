public class Tablica {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

        for (int i = 0; i < tablica.length; i++) {
            int number = tablica[i];
            System.out.println(number);
        }
        System.out.println();
        Integer[] tablica2 = { 21, 22, 23, 24, 25, 26};

        for (int i = 0; i < tablica2.length; i++) {
            int number = tablica2[i];
            System.out.println(number);
        }


        System.out.println();
        String[] tablica3 = { "a1", "a2", "23"};

        for (int i = 0; i < tablica3.length; i++) {
            System.out.println(tablica3[i]);
        }

    }
}
