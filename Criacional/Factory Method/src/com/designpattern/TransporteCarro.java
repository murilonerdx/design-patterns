package com.designpattern;

import com.designpattern.veiculo.Carro;
import com.designpattern.veiculo.IVeiculo;

public class TransporteCarro extends Transporte{
    @Override
    protected IVeiculo createTransport() {
        return new Carro();
    }
}
