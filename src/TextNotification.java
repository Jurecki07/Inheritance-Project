import java.time.LocalDateTime;




public class TextNotification {
    private String recipient;
    private String smsProvider;

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
    }

//    Generate All in Constructor

}

