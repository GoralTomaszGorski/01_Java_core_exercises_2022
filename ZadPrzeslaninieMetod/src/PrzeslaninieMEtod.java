public class PrzeslaninieMEtod {
    public static void main(String[] args) {
        Dodawanie suma = new Dodawanie();

        System.out.println(suma.dodaj(1 ,1, 0));//przeciazanie metody wybór odpowiedniej metody przez INTELLIJ spelniajacych kryteria
        System.out.println(suma.dodaj(1.3 ,1));
        System.out.println(suma.dodaj(1.98 ,1.5, 0));
        System.out.println(suma.dodaj(1 ,1));

    }
}
