package sadovnikov.ObraboktaOshibok.Pochta;

import java.util.logging.*;

public class Main {
    public static void main(String[] args) {

        MailPackage message = new MailPackage("Den", "Alex",
                new Package("Message with and ",2000));
        MailMessage message1 = new MailMessage("Den", "Austin Powers",
                "Message with weapons and stolen and banned substance");

        Spy spy = new Spy(Logger.getLogger("LOGGER"));
        Inspector inspector = new Inspector();
        Thief thief = new Thief(1000);
        MailService[] agents1 = new MailService[] {spy, thief, inspector};
        MailService[] agents2 = new MailService[] {spy, thief, inspector};

        UntrustworthyMailWorker mailWorker = new UntrustworthyMailWorker(agents1);
        mailWorker.processMail(message1);
        mailWorker.processMail(message);


    }
}
