package Processor;

import Method.PaymentMethod;

public class PaymentProcessor {
    private Order order;
    private PaymentMethod paymentMethod;

    public PaymentProcessor(Order order, PaymentMethod paymentMethod){
        this.order = order;
        this.paymentMethod = paymentMethod;
    }

    public void processOrderPayment() {
       if (paymentMethod.authorizePayment(order.getOrderAmount())){
        paymentMethod.processPayment(order.getOrderAmount());
       };
    }
}
