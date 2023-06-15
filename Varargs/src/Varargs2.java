public class Varargs2 {
    public static void main(String[] args) {
        String rezultat = add(1, "aaa", "bbbbbbbb", "cccccccc", "ddddddd", "eeee");
    }

    private static String add(int cyfra, String... zapiski) {
        String napis = " ";

        for (int i = 0; i < zapiski.length; i++) {
            String wartoscAktualna = (zapiski[i]);
            System.out.println("zapisuje aktualnie pozycje nr " + (i+1)+ " " + wartoscAktualna);

            System.out.println(napis += wartoscAktualna+ " ");
        }
        return napis;
    }
}
