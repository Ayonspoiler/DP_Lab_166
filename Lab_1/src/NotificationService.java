public interface NotificationService {
    void sendNotification(Rider rider, Driver driver, String message);
}

class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(Rider rider, Driver driver, String message) {
        System.out.println("Sending SMS to Rider: " + rider.getName() + " and Driver: " + driver.getName() + " with message: " + message);

    }
}
class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(Rider rider, Driver driver, String message) {
        System.out.println("Sending SMS to Rider: " + rider.getName() + " and Driver: " + driver.getName() + " with message: " + message);
    }
}