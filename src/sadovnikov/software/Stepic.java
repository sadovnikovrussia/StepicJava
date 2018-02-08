package sadovnikov.software;
/**
 * A programm that prints <code>Hello Stepic!</code>
 *
 * @author Sadovnikov Alexey
 * @version 1.0
 */
public class Stepic {
    /**
     * Program entry point.
     *
     * @param cmdArgs command-line arguments
     */
    public static void main(String[] cmdArgs) {
        System.out.println("Hello Stepic");
        // single
        byte a = -1;
        System.out.println(Byte.toString(a));
        System.out.println(Integer.toBinaryString((int)a));
        a >>= 1;
        System.out.println(Byte.toString(a));
        System.out.println(Integer.toBinaryString((int)a));
        //System.out.println((int)a);
        int b = a >>> 7;
        int c = a >> 7;
        System.out.println((byte)b);

        /*
        multiple
         */

    }
}
