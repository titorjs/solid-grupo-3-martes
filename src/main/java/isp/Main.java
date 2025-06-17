package isp;

public class Main {
    public static void main(String[] args) {
        Powerable phone = new Phone();
        Powerable camera = new DisposableCamera();

        // Encender y apagar dispositivos
        phone.turnOn();
        phone.turnOff();

        camera.turnOn();
        camera.turnOff();

        // Cargar solo dispositivos que implementan Rechargeable
        if (phone instanceof Rechargeable) {
            ((Rechargeable) phone).charge();
        }

        if (camera instanceof Rechargeable) {
            ((Rechargeable) camera).charge(); // No se ejecuta ni lanza excepción
        }
    }
}