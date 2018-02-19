package sadovnikov.ObraboktaOshibok.Pochta;

public class UntrustworthyMailWorker implements MailService {

    private final RealMailService realMailService = new RealMailService();
    private MailService[] services;

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable modifiedMail = mail;
        for (MailService service : services) {
            modifiedMail = service.processMail(modifiedMail);
        }
        return realMailService.processMail(modifiedMail);
    }

    public UntrustworthyMailWorker(MailService[] mailServices) {
            this.services = mailServices;
        }

    RealMailService getRealMailService() {

        return realMailService;
    }
}
