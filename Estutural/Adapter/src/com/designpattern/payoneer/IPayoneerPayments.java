package com.designpattern.payoneer;

import com.designpattern.util.Token;

public interface IPayoneerPayments {
    Token authToken();
    void payoneerPayment();
    void payoneerReceive();
}
