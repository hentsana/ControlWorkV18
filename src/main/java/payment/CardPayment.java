package payment;

import exeption.PaymentExeption;

public class CardPayment implements Payment{
    public void pay(double amount){
        if(amount > 45000){
            throw new PaymentExeption("Card limit");
        }
        System.out.println("Payment success.");
    }
}
