package com.designpattern.director;

import com.designpattern.builders.IBuilder;
import com.designpattern.components.CarType;
import com.designpattern.components.Engine;
import com.designpattern.components.Transmission;

public class Director {
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruckCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(13000));
    }
}
