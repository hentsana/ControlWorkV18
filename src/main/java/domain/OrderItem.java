package domain;

public class OrderItem {
    private String name;
    private Money price;
    private int quantity;

    public OrderItem(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public double total() {
        return quantity * price.getAmount();
    }
}
