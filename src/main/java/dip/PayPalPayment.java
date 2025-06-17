package dip;

class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}