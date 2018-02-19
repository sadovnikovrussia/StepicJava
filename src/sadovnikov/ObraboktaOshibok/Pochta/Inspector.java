package sadovnikov.ObraboktaOshibok.Pochta;


public class Inspector implements MailService {

    static final String WEAPONS = "weapons";
    static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {
        System.out.println("inpector");

        if (mail instanceof MailPackage) {
            System.out.println("inpector1");
            MailPackage mailPackage = (MailPackage) mail;
            Package pac = mailPackage.getContent();
            String message = pac.getContent();
            int price = pac.getPrice();
            System.out.println(message);
            System.out.println(price);
            System.out.println(message.contains(WEAPONS));
            if (message.contains(WEAPONS) || (message.contains(BANNED_SUBSTANCE))) {
                System.out.println("inspector2");
                throw new IllegalPackageException();
            }
            if (message.contains("stones")){
                System.out.println("inspector3");
                throw new StolenPackageException();
            }

        }
        return mail;
    }
}

class IllegalPackageException extends RuntimeException {

}

class StolenPackageException extends RuntimeException {

}