package dip;

class CryptoPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with Cryptocurrency.");
    }
}
