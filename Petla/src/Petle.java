public class Petle {
    public static void main(String[] args) {

//petla while najpierw wprawdza warunek pozniej robi
        System.out.println("Petla while");
        int i = 0;
        while (i<5){
            System.out.println("While "+ i);
            i++;
        }
        System.out.println();

        System.out.println("Petla do while");
//do while wykona sie co najmniej raz najpierw robi pozniej mysli;)
        int a = 100;
        do {
            System.out.println("do while "+ a);
            a++;
        } while (a<10);

        System.out.println();

        System.out.println("Petla for ");
        for (int j = 0; j < 3; j++) {
            System.out.println("Petla for " + j);

        }

    }
}
