public class Conversions {
    public static void main(String[] args){
        double a = 13.21;
        int b = 4;

        double wynik = a / b;
        System.out.println(wynik);
        // BŁAD int c = a/b;
        //System.out.println(c);

        //konwersacja zawaężejąca
        int c = (int)a/b;
        System.out.println(c);
        //tutaj usica reszte

        char char1 = 'n'; //char to jeden znak
        //char char2 = 's1'; //BŁAD

        System.out.println(char1);
        //System.out.println(char2);

        String ciagZnakow = "Cos jest napisane";
        System.out.println(ciagZnakow);

        int d = char1;
        System.out.println(d);



    }
}
