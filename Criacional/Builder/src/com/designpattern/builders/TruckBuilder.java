package com.designpattern.builders;

import com.designpattern.cars.Car;
import com.designpattern.cars.Truck;
import com.designpattern.components.CarType;
import com.designpattern.components.Engine;
import com.designpattern.components.Transmission;

public class TruckBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;


    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){
        return new Truck(carType, seats,engine,transmission);
    }
}
