package Social_Media_Class;

import Adapter_factory_class.Notification;
    import Interfaces.Adapter;

    import java.util.ArrayList;
    import java.util.List;

    public class Facebook implements Adapter {
        private List<Notification>notifications = new ArrayList<>();

        public Facebook() {
            // Mock notifications for Facebook
            notifications.add(new Notification("2", "New friend request"));
        }

        @Override
        public List<Notification> getNotifications() {
            return notifications;
        }

        @Override
        public void markAsRead(String notificationId) {
            System.out.println("Facebook: Marking notification " + notificationId + " as read.");
        }

        @Override
        public void markAsUnread(String notificationId) {
            System.out.println("Facebook: Marking notification " + notificationId + " as unread.");
        }

        @Override
        public void deleteNotification(String notificationId) {
            System.out.println("Facebook: Deleting notification " + notificationId);
        }
    }
