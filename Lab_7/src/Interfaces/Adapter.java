package Interfaces;

import Adapter_factory_class.Notification;

import java.util.List;

public interface Adapter {
    List<Notification> getNotifications();
    void markAsRead(String notificationId);
    void markAsUnread(String notificationId);
    void deleteNotification(String notificationId);
}
