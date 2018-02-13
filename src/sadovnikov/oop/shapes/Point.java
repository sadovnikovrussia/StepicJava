package sadovnikov.oop.shapes;

/**
 * Created by vitaly on 24/09/16.
 */
public class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}
