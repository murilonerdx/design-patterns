package com.designpattern.fabrica;

import com.designpattern.aeronave.Helicoptero;
import com.designpattern.aeronave.IAeronave;
import com.designpattern.veiculosterrestres.IVeiculoTerrestre;
import com.designpattern.veiculosterrestres.Motocicleta;

public class NineNineTransporte implements ITransporteFabrica{
    @Override
    public IVeiculoTerrestre createTransportVehicle() {
        return new Motocicleta();
    }

    @Override
    public IAeronave createTransportAircraft() {
        return new Helicoptero();
    }
}
