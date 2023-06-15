import java.util.LinkedList;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        LinkedList m = new LinkedList();
        Random generator = new Random();

        for(int i=0; i<10; i++) {

            m.add(generator.nextInt(10));
        }
        System.out.println(m);

        Random geneartorFloat = new Random();
        LinkedList listaFloat = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            listaFloat.add(geneartorFloat.nextFloat(100));
        }
        System.out.println(listaFloat);

    }

}
