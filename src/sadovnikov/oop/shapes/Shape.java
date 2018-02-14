package sadovnikov.oop.shapes;

/**
 * Created by vitaly on 24/09/16.
 */


public abstract class Shape {
    private final Color color;

    Shape(Color color) { this.color = color; }

    Color getColor() { return color; }

    public abstract double getArea();

}
