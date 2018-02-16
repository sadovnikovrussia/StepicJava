package sadovnikov.ObraboktaOshibok.TestLogging;

import java.util.logging.*;

public class Logirovanie {
    public static void configureLogging() {
        Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER_A.setLevel(Level.ALL);
        Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER_B.setLevel(Level.WARNING);

        Logger LOGGER = Logger.getLogger("org.stepic.java");
        LOGGER.setLevel(Level.ALL);

        XMLFormatter xmlFormatter = new XMLFormatter();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(xmlFormatter);
        LOGGER.addHandler(consoleHandler);
        LOGGER.setUseParentHandlers(false);
    }
}
