public class PushNotificationSender implements MessageSender{
    public void send(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}
