package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{
    private CarDatabase carDatabase;

    public CarManager(CarDatabase carDatabase)
    {
        this.carDatabase = carDatabase;
    }

    public Car getCarById(final String carId)
    {
        return carDatabase.getCarById(carId);
    }

    public List<Car> getAllCars()
    {
        return carDatabase.getAllCars();
    }

    public Car getBestCar()
    {
        return carDatabase.getBestCar();
    }
}
