package Method;

public interface PaymentMethod {
    public boolean authorizePayment(double amount);
    public void processPayment(double amount);
}