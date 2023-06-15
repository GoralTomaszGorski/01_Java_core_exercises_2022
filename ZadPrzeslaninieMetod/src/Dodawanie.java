public class Dodawanie {
    int dodaj(int a, int b){
        System.out.println("parametry int int");
        return a+b;
            }
    double dodaj(double a, double b){
        System.out.println("parametry double double");
        return a+b;
    }

    int dodaj(int a, int b, int c){
        System.out.println("parametry int int int");
        return a+b+c;
    }
    double dodaj(double a, double b, double c){
        System.out.println("parametry double double double");
        return a+b+c;
    }
}
