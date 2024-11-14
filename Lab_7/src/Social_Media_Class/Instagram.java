package Social_Media_Class;

import Adapter_factory_class.Notification;
import Interfaces.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Instagram implements Adapter {
    private List<Notification> notifications = new ArrayList<>();

    public Instagram() {
        // Mock notifications for Instagram
        notifications.add(new Notification("3", "New like on your photo"));
    }

    @Override
    public List<Notification> getNotifications() {
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("Instagram: Marking notification " + notificationId + " as read.");
    }

    @Override
    public void markAsUnread(String notificationId) {
        System.out.println("Instagram: Marking notification " + notificationId + " as unread.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Instagram: Deleting notification " + notificationId);
    }
}
