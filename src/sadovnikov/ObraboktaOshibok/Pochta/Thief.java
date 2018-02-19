package sadovnikov.ObraboktaOshibok.Pochta;

public class Thief implements MailService {

    private int price;
    private int stolenValue = 0;

    @Override
    public Sendable processMail(Sendable mail) {
        if ((mail instanceof MailPackage) && ((MailPackage) mail).getContent().getPrice() >= price) {
            stolenValue += price;
            System.out.println("theif");
            return new MailPackage(mail.getFrom(), mail.getTo(),
                            new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(),
                                    0));
        }
        return mail;
    }

    public Thief(int price) {
        this.price = price;
    }

    int getStolenValue() {
        return stolenValue;
    }
}
