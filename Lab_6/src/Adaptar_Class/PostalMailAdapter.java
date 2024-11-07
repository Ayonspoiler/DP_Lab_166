package Adaptar_Class;
import Interface.NotificationSender;
import Interface.PostalMail;


public class PostalMailAdapter implements NotificationSender {
    private PostalMail postalMail;

    public PostalMailAdapter(PostalMail postalMail) {
        this.postalMail = postalMail;
    }

    @Override
    public void sendNotification(String message, String receiver) {
        String[] parts = receiver.split("\\|");
        String recipientName = parts[0];
        String address=parts[1];
        String postalCode=parts[2];
        postalMail.sendPostalMail(message,recipientName,address,postalCode);
    }
}