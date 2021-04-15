package com.designpattern;

import com.designpattern.builders.CarBuilder;
import com.designpattern.builders.TruckBuilder;
import com.designpattern.cars.Car;
import com.designpattern.cars.Truck;
import com.designpattern.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder Carbuilder = new CarBuilder();
        director.constructSedanCar(Carbuilder);

        Car car = Carbuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();

        director.constructTruckCar(truckBuilder);
        Truck truck = truckBuilder.getResult();

        System.out.println(truck.getCarType() + " produzido com sucesso!");


    }
}
