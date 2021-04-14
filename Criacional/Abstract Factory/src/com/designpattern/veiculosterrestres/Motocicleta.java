package com.designpattern.veiculosterrestres;

public class Motocicleta implements IVeiculoTerrestre{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda!");
    }
}
