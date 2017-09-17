import java.time.LocalDateTime;


public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;
//    why did we do protected?

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "default";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport() throws NoTransportException;



}
