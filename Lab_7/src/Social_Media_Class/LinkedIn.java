package Social_Media_Class;

import Adapter_factory_class.Notification;
import Interfaces.Adapter;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements Adapter {
    private List<Notification> notifications = new ArrayList<>();

    public LinkedIn() {
        // Mock notifications for LinkedIn
        notifications.add(new Notification("4", "New job suggestion"));
    }

    @Override
    public List<Notification> getNotifications() {
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("LinkedIn: Marking notification " + notificationId + " as read.");
    }

    @Override
    public void markAsUnread(String notificationId) {
        System.out.println("LinkedIn: Marking notification " + notificationId + " as unread.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("LinkedIn: Deleting notification " + notificationId);
    }
}
