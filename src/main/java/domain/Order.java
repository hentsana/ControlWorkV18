package domain;

import java.util.Arrays;

public class Order {
    private String orderId;
    private Email email;
    private OrderStat order;
    private OrderItem[] orderItem;

    public Order(String orderId, Email email, Order order, OrderItem[] orderItem) {
        this.orderId = orderId;
        this.email = email;
        this.order = OrderStat.NEW;
        this.orderItem = Arrays.copyOf(orderItem, orderItem.length);
    }

    public OrderItem[] getOrderItem() {
        return Arrays.copyOf(orderItem, orderItem.length);
    }
    public double total() {
        double total = 0;
        for(OrderItem orderItem : orderItem){
            total += orderItem.total();
        }
        return total;
    }

    public OrderStat getOrderStatus(){
        return order;
    }

    public void pay(){
        this.order = OrderStat.PAID;
    }

    public String getOrderId(){
        return orderId;
    }

    public  Email getEmail(){
        return email;
    }

    public void cancel(){
        if(order == OrderStat.PAID){
            order = OrderStat.CANCELLED;
        }
    }
}
