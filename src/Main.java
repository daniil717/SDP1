import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> notificationMethods = Arrays.asList(
                new SMSNotification(),
                new EmailNotification(),
                new PushNotification()
        );

        List<String> recipients = Arrays.asList("user1", "user2", "user3");

        BulkNotificationSender bulkSender = new BulkNotificationSender(notificationMethods);
        bulkSender.sendBulkNotifications("Hello!", recipients);
    }
}
