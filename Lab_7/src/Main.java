import Adapter_factory_class.NotificationAggregator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotificationAggregator aggregator = new NotificationAggregator();

        while (true) {
            System.out.println("Enter the platform name (e.g., twitter, facebook, instagram, linkedin) or 'exit' to quit:");
            String platformName = scanner.nextLine().trim().toLowerCase();

            if (platformName.equals("exit")) {
                break;
            }

            // Display notifications for the selected platform
            aggregator.displayNotifications(platformName);

            System.out.println("Choose an action: markasread, markasunread, delete, or 'back' to choose a different platform:");
            String action = scanner.nextLine().trim().toLowerCase();

            if (action.equals("back")) {
                continue;
            }

            System.out.println("Enter the notification ID:");
            String notificationId = scanner.nextLine().trim();

            // Perform the selected action
            switch (action) {
                case "markasread":
                    aggregator.markNotificationAsRead(platformName, notificationId);
                    break;
                case "markasunread":
                    aggregator.markNotificationAsUnread(platformName, notificationId);
                    break;
                case "delete":
                    aggregator.deleteNotification(platformName, notificationId);
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
        scanner.close();
    }
}
