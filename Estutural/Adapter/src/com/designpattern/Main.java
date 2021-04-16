package com.designpattern;

import com.designpattern.adapter.PayoneerAdapter;
import com.designpattern.payoneer.IPayoneerPayments;
import com.designpattern.payoneer.Payoneer;
import com.designpattern.paypal.IPayPalPayments;
import com.designpattern.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
//        IPayPalPayments payment = new PayPal();
//        payment.paypalPayment();
//        payment.paypalReceive();

        IPayPalPayments payment2 = new PayoneerAdapter(new Payoneer());

        payment2.paypalPayment();
        payment2.paypalReceive();
    }
}
