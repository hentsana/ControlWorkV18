package domain;

import java.util.Objects;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Money discont(double discontPercent) {
        return new Money(amount * (1 - discontPercent));
    }

    public String toString(){
        return "Amount: " + amount;
    }

    public int hashCode() {
        return Objects.hash(amount);
    }
}
