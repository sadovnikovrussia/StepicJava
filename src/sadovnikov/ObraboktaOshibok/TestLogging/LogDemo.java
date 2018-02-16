package sadovnikov.ObraboktaOshibok.TestLogging;

import java.util.logging.*;

public class LogDemo {

    private static final Logger LOGGER = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.WARNING, "STARTED", args);
        System.out.println(LOGGER.getName());

        try {
            randomFailAlgorithm();
        } catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "VSE POSHLO PO PIZDE", e);
            System.exit(2);
        }

        LOGGER.fine("Finish");
    }

    private static void randomFailAlgorithm() {
        double random = Math.random();
        LOGGER.log(Level.CONFIG, "Generated random number = {0}", random);
        if (random > 0.5) {
            throw new IllegalStateException("Generated random number > 0.5");
        }
    }
}

