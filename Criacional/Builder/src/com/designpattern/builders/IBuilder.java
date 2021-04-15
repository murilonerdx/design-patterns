package com.designpattern.builders;

import com.designpattern.components.CarType;
import com.designpattern.components.Engine;
import com.designpattern.components.Transmission;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
