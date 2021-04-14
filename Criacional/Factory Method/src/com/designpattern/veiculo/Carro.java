package com.designpattern.veiculo;

public class Carro implements IVeiculo {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");

    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros");
    }
}
