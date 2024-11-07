package Class;

import Interface.NotificationSender;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }
}
