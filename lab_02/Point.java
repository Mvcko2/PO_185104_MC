public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void distance(Point otherPoint){
        System.out.println(Math.hypot(this.x - otherPoint.x, this.y-otherPoint.y));
    }
}
