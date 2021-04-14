package com.designpattern;

import com.designpattern.veiculo.IVeiculo;

public abstract class Transporte {

    void startTransporte(){
        IVeiculo veiculo = createTransport();
        veiculo.startRoute();
    }

    protected abstract IVeiculo createTransport();
}
