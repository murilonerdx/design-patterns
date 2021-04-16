package com.designpattern.paypal;

import com.designpattern.util.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
