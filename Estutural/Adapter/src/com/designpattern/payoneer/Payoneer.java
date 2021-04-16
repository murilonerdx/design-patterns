package com.designpattern.payoneer;

import com.designpattern.util.Token;

public class Payoneer implements IPayoneerPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payoneerPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com payoneear");
    }

    @Override
    public void payoneerReceive() {
        System.out.println("recebendo pagamentos com payoneear");
    }

}
