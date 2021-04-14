package com.designpattern.app;

import com.designpattern.aeronave.IAeronave;
import com.designpattern.fabrica.ITransporteFabrica;
import com.designpattern.veiculosterrestres.IVeiculoTerrestre;

public class Application {
    private final IVeiculoTerrestre veiculo;
    private final IAeronave aeronave;

    public Application(ITransporteFabrica fabrica){
        veiculo = fabrica.createTransportVehicle();
        aeronave = fabrica.createTransportAircraft();
    }

    public void startRoute(){
        veiculo.startRoute();
        aeronave.startRoute();
    }
}
