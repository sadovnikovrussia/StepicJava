package sadovnikov.oop.timer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTimer(Main::BigDecimalPower);
        System.out.println(time);
    }

    private static void BigDecimalPower() {
        new BigDecimal("1234567").pow(100000);
    }


}
