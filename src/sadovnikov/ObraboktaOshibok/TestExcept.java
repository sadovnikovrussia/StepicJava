package sadovnikov.ObraboktaOshibok;

public class TestExcept {

    public static void main(String args[]) {
        try {
            int array[] = new int[2];
            System.out.println("Доступ к третьему элементу:" + array[3]);
            System.out.println("Доступ к первому элементу:" + array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение:" + e);
        }
        System.out.println("Вне блока");
        double f = sqrt(-5);
    }


    static double sqrt(double x) throws IllegalArgumentException {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
    }
}
