package com.designpattern.veiculo;

public class Motocicleta implements IVeiculo {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
