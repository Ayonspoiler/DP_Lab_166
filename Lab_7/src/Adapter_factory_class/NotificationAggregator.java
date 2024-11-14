package Adapter_factory_class;

import Adapter_factory_class.Notification;
import Interfaces.Adapter;
import Social_Media_Class.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotificationAggregator {
    private List<Adapter> platforms = new ArrayList<>();

    public NotificationAggregator() {

        platforms.add(new Twitter());
        platforms.add(new Facebook());
        platforms.add(new Instagram());
        platforms.add(new LinkedIn());
    }

    // Retrieve all notifications from a specific platform by name
    public List<Notification> getNotifications(String platformName) {
        for (Adapter platform : platforms) {
            if (platform.getClass().getSimpleName().toLowerCase().equals(platformName.toLowerCase())) {
                return platform.getNotifications();
            }
        }
        System.out.println("Platform " + platformName + " not found.");
        return new ArrayList<>();
    }

    // Mark a notification as read, specifying the platform and notification ID
    public void markNotificationAsRead(String platformName, String notificationId) {
        for (Adapter platform : platforms) {
            if (platform.getClass().getSimpleName().toLowerCase().equals(platformName.toLowerCase())) {
                platform.markAsRead(notificationId);
                return;
            }
        }
        System.out.println("Platform " + platformName + " not found.");
    }

    // Mark a notification as unread, specifying the platform and notification ID
    public void markNotificationAsUnread(String platformName, String notificationId) {
        for (Adapter platform : platforms) {
            if (platform.getClass().getSimpleName().toLowerCase().equals(platformName.toLowerCase())) {
                platform.markAsUnread(notificationId);
                return;
            }
        }
        System.out.println("Platform " + platformName + " not found.");
    }

    // Delete a notification, specifying the platform and notification ID
    public void deleteNotification(String platformName, String notificationId) {
        for (Adapter platform : platforms) {
            if (platform.getClass().getSimpleName().toLowerCase().equals(platformName.toLowerCase())) {
                platform.deleteNotification(notificationId);
                return;
            }
        }
        System.out.println("Platform " + platformName + " not found.");
    }

    // Display notifications for a platform
    public void displayNotifications(String platformName) {
        List<Notification> notifications = getNotifications(platformName);
        if (!notifications.isEmpty()) {
            System.out.println("Notifications from " + platformName + ":");
            for (Notification notification : notifications) {
                System.out.println("ID: " + notification.getId() + " | Content: " + notification.getContent());
            }
        }
    }
}
