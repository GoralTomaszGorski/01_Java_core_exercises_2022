import java.util.Scanner;

public class Throw {
    public static void main(String[] args) throws ArithmeticException {
        int a = 10;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzielnik ");
        b = scanner.nextInt();


        if  (b == 0){
            throw new ArithmeticException("nie morzna dzielic przez 0 ");
        }
        else System.out.println(a/b);

    }
}
