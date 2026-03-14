package payment;

import exeption.PaymentExeption;

public interface Payment {
    void pay(double amount) throws PaymentExeption;
}
