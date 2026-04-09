
class Notifier {
    public void send(String message) {
        System.out.println("General Notification: " + message);
    }
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
    void send(String message, long phone) {
        System.out.println("SMS sent to " + phone + ": " + message);
    }
    private void sendInternal(String message) {
        System.out.println("Internal Notification: " + message);
    }
    public void accessPrivate(String message) {
        sendInternal(message);
    }
}
class AppNotifier extends Notifier {

    void display() {
        send("Hello User");
        send("Hello via Email", "user@gmail.com");
        send("Hello via SMS", 9876543210L);
        accessPrivate("Private Message");
    }
}
class Main1 {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.display();
    }
}