package ocp;

public class Main {
    public static void main(String[] args) {
        // 1. Se crea una única instancia del servicio.
        NotificationService service = new NotificationService();

        // 2. Se usa el servicio con cada tipo de notificación.
        // El servicio no cambia, solo cambia el objeto que le pasas.
        service.send(new EmailNotification(), "Hello via Email!");
        service.send(new SMSNotification(), "Hello via SMS!");
        service.send(new PushNotification(), "Hello via Push Notification!");
        service.send(new FaxNotification(), "Hello via Fax!");
    }
}