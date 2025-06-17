package dip;

class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card.");
    }
}
