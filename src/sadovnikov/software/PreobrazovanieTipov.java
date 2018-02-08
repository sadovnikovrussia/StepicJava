package sadovnikov.software;

import static java.lang.Math.*;

public class PreobrazovanieTipov {
    public static void main(String[] args) {
        /*Integer fromString = Integer.parseInt("123");
        //int b = (int)"123";
        int fromInteger = fromString.intValue();

        System.out.println(fromString);
        System.out.println(fromInteger);
        //System.out.println(b);
        */
        int a = 5;
        int b = Integer.bitCount(a);
        System.out.println(b);
    }
}
