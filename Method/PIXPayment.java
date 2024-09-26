package Method;

public class PIXPayment implements PaymentMethod{
    private String pix;

    public PIXPayment(String pix){
        this.pix = pix;
    }

    @override
    public boolean authorizePayment(double amount){
        System.out.println("Pagamento autorizado em PIX");
        return true;
    }

    @override
    public void processPayment(double amount){
        System.out.println("Pagamento em processo em PIX");
    }
}