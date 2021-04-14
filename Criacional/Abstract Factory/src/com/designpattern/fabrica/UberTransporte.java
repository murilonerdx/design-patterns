package com.designpattern.fabrica;

import com.designpattern.aeronave.Aeronave;
import com.designpattern.aeronave.IAeronave;
import com.designpattern.veiculosterrestres.Carro;
import com.designpattern.veiculosterrestres.IVeiculoTerrestre;

public class UberTransporte implements ITransporteFabrica{
    @Override
    public IVeiculoTerrestre createTransportVehicle() {
        return new Carro();
    }

    @Override
    public IAeronave createTransportAircraft() {
        return new Aeronave();
    }
}
