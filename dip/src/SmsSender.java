public class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}
