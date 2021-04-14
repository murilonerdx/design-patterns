package com.designpattern.aeronave;

public class Helicoptero implements IAeronave {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, vão autorizado");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, Sul, Ventos ok!");
    }
}
