import Method.CreditCardPayment;
import Method.PIXPayment;
import Method.PaymentMethod;
import Processor.Order;
import Processor.PaymentProcessor;

public class main {
    public static void main(String[] args) {
        Order order = new Order("ORD123", 100.50);

        //Pagamento Crédito
        PaymentMethod creditcard = new CreditCardPayment("1234567898765432", "Alice Dias", "25/10", 123);
        PaymentProcessor processor = new PaymentProcessor(order, creditcard);
        processor.processOrderPayment();

        //Pagamento PIX
        PaymentMethod pix = new PIXPayment("123456798");
        processor = new PaymentProcessor(order, pix);
        processor.processOrderPayment();
    }
}
