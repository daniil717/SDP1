import java.util.List;

public class BulkNotificationSender {
    private List<Notification> notificationMethods;

    public BulkNotificationSender(List<Notification> notificationMethods) {
        this.notificationMethods = notificationMethods;
    }

    public void sendBulkNotifications(String message, List<String> recipients) {
        for (String recipient : recipients) {
            for (Notification method : notificationMethods) {
                method.sendNotification(message, recipient);
            }
        }
    }
}
