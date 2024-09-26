package Method;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;
    
    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, int cvv){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }  

    @override
    public boolean authorizePayment(double amount){
        System.out.println("Pagamento autorizado em Credito");
        return true;
    }

    @override
    public void processPayment(double amount){
        System.out.println("Pagamento em processo em Credito");
    }
}
