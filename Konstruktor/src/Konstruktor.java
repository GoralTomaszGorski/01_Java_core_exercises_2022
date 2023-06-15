public class Konstruktor {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println("X1: " + point1.x);
        System.out.println("Y1: " + point1.y);

        Point point2 = new Point(point1);
        System.out.println("X2: " + point2.x);
        System.out.println("Y2: " + point2.y);

        point1.x = 1;
        point1.y = 1;
        System.out.println("X1: " + point1.x);
        System.out.println("Y1: " + point1.y);

        Point point3 = new Point(point1);
        System.out.println("X3: " + point3.x);
        System.out.println("Y3: " + point3.y);


    }
}
