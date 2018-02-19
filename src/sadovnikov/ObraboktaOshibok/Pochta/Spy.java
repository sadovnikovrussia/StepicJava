package sadovnikov.ObraboktaOshibok.Pochta;

import java.util.logging.*;

public class Spy implements MailService {

    private Logger logger;
    private static final String AUSTIN_POWERS = "Austin Powers";

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getTo().equals(AUSTIN_POWERS))
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} {2}",
                        new String[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
            else logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                    new String[]{mail.getFrom(), mail.getTo()});
        }
        return mail;
    }

    public Spy(Logger logger) {
        this.logger = logger;
    }
}
