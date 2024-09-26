package Processor;

public class Order {
    private String orderID;
    private Double orderAmount;

    public Order(String orderID, Double orderAmount){
        this.orderID = orderID;
        this.orderAmount = orderAmount;
    }

    public String getOrderID(){
        return orderID;
    }

    public double getOrderAmount(){
        return orderAmount;
    }
}
