package com.designpattern;

import com.designpattern.veiculo.IVeiculo;
import com.designpattern.veiculo.Motocicleta;

public class TransporteMotocicleta extends Transporte{
    @Override
    protected IVeiculo createTransport() {
        return new Motocicleta();
    }
}
