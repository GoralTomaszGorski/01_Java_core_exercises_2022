public class Point {
    int x;
    int y;


    public Point(int a, int b){
        x = a;
        y = b;
    }

    public Point(Point pkt){
        x = pkt.x;
        y = pkt.y;
    }
}
