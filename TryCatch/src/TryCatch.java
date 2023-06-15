public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(devide(10, 0));

        } catch (ArithmeticException e) {
            System.out.println("nie dzielimy przez 0");
        }
    }
    private static int devide(int a, int b) throws ArithmeticException{
        return a/b;
        }

    }


