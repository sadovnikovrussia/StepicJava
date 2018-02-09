package sadovnikov.software;

import java.math.BigInteger;
import java.util.Arrays;

public class UprConstr {
    public static void main(String[] args) {
        //System.out.println(weather(Boolean.TRUE));
        System.out.println(factorial(4));
        int [] result = joinArrays(new int[] {}, new int[] {});
        System.out.println(Arrays.toString(result));
    }

    private static String weather(Boolean weatherGood) {
        return ("Weather is " + (weatherGood ? "good" : "bad"));
    }

    private static BigInteger factorial(int value) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i < value + 1; i++) {
            f = BigInteger.valueOf(i).multiply(f);
        }
        return f; // your implementation here
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int l1 = a1.length;
        int l2 = a2.length;
        int maxlen = Math.max(l1,l2);
        int a3 [] = new int [l1+l2];




        return new int[2]; // your implementation here
    }

    public static int[] joinArrays(int[] a1, int[] a2) {
        if (a1 == null) {
            return a2;
        }
        if (a2 == null) {
            return a1;
        }
        int[] res = new int[a1.length + a2.length];

        //System.arraycopy(a1, 0, res, 0, a1.length);
        for (int i = 0; i < a1.length; i++){

        }
        //System.arraycopy(a2, 0, res, a1.length, a2.length);
        Arrays.sort(res);
        return res ;
    }
}
