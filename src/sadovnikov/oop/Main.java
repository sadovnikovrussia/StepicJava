package sadovnikov.oop;

public class Main {
    public static void main(String[] args) {
        double c = 1;
        double m = 1;
        ComplexNumber a = new ComplexNumber(-2.5, -3.5);
        ComplexNumber b = new ComplexNumber(-2.5, -3.5);
        ComplexNumber d = a;
        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(d.hashCode());
        System.out.println(Double.hashCode(c));
        System.out.println(Double.hashCode(m));
        System.out.println();
    }
}
