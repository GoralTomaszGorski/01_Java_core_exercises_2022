public class ParametryThis {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(4, 5);
        System.out.println("x: " +punkt1.x + "y: "+punkt1.y);

        punkt1.setPunkt(0,0);
        System.out.println("x: " +punkt1.x + "y: "+punkt1.y);
    }

}
