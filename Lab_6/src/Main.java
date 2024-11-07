import Adaptar_Class.PostalMailAdapter;
import Interface.NotificationSender;
import Interface.PostalMail;
import Class.EmailNotificationSender;
import Class.PostalMailSender;
import Class.SMSNotificationSender;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailNotificationSender();
        NotificationSender smsSender = new SMSNotificationSender();

        // Create postal mail sender using adapter
        PostalMail postalMail = new PostalMailSender();
        NotificationSender postalMailSender = new PostalMailAdapter(postalMail);

        // Sending notifications
        emailSender.sendNotification("Hello Ayon!", "ayon4052@gmail.com");
        smsSender.sendNotification("Hello Ayon!", "01723486580");

        // Postal mail expects a format with name, address, and postal code
        postalMailSender.sendNotification("Hello Postal Mail to Ayon!", "Ayon Alam|Sector#6,Uttara|1230");
    }
    }
