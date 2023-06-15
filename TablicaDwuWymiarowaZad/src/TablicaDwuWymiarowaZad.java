public class TablicaDwuWymiarowaZad {
    public static void main(String[] args) {
        int tablica2[][] = new int[3][2];
        int a = 0 ;


        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++) {
                tablica2[i][j] = a++;
            }
            System.out.println();
        }
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++) {
                System.out.print(tablica2[i] [j]);

            }
            System.out.println();
        }


        int[][] tab = new int[2][3];
        int licznik = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = licznik++;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("tab[%d][%d]=%d \n", i, j, tab[i][j]);
            }
        }
    }
}


