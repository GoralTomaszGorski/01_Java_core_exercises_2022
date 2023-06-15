public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int [] [] tablicaDwaWymiary = new int[5][5];
        tablicaDwaWymiary [1][2] = 3;
        tablicaDwaWymiary [1][3] = 3;
        tablicaDwaWymiary [1][4] = 3;
        tablicaDwaWymiary [1][0] = 3;
        tablicaDwaWymiary [1][1] = 3;
        tablicaDwaWymiary [0][1] = 3;

        for (int i = 0; i < tablicaDwaWymiary.length; i++) {
            int [] jednowymairowa = tablicaDwaWymiary[i];
            for (int j = 0; j < jednowymairowa.length; j++) {
                System.out.print(tablicaDwaWymiary [i] [j]+" ");
            }
            System.out.println();
        }
    }
}
