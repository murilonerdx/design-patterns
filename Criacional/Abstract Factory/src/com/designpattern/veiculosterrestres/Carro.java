package com.designpattern.veiculosterrestres;

public class Carro implements IVeiculoTerrestre{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros estamos prontos");

    }
}
