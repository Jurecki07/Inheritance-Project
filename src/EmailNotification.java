import java.time.LocalDateTime;


public class EmailNotification extends Notification{

    private String recipient;
    private String smtpProvider;

//    Get pauls help

    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "email";
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }
}
