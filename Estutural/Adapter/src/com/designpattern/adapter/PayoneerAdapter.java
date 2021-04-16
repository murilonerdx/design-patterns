package com.designpattern.adapter;

import com.designpattern.payoneer.Payoneer;
import com.designpattern.paypal.IPayPalPayments;
import com.designpattern.util.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneear utilizando metodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.payoneerPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.payoneerReceive();
    }
}
