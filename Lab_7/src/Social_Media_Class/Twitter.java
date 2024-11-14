package Social_Media_Class;

import Adapter_factory_class.Notification;
import Interfaces.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Twitter implements Adapter {
    private List<Notification> notifications = new ArrayList<>();

    public Twitter() {
        // Mock notifications for Twitter
        notifications.add(new Notification("1", "New Tweet from @user"));
    }

    @Override
    public List<Notification> getNotifications() {
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("Twitter: Marking notification " + notificationId + " as read.");
    }

    @Override
    public void markAsUnread(String notificationId) {
        System.out.println("Twitter: Marking notification " + notificationId + " as unread.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleting notification " + notificationId);
    }



}

