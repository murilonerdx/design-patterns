package com.designpattern.fabrica;

import com.designpattern.aeronave.IAeronave;
import com.designpattern.veiculosterrestres.IVeiculoTerrestre;

public interface ITransporteFabrica {
    IVeiculoTerrestre createTransportVehicle();
    IAeronave createTransportAircraft();
}
