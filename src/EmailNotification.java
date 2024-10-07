public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
