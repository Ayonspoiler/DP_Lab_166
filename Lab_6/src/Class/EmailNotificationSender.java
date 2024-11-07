package Class;

import Interface.NotificationSender;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message, String receiver) {
        System.out.println("Sending Email to " + receiver + ": " + message);
    }
}