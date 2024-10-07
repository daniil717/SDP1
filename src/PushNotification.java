public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }
}
