package isp;

class Phone implements Powerable, Rechargeable {
    public void turnOn() { System.out.println("Phone ON"); }
    public void turnOff() { System.out.println("Phone OFF"); }
    public void charge() { System.out.println("Charging phone..."); }
}
